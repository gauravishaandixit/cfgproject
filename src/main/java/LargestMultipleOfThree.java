import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestMultipleOfThree {
    public static void main(String[] arg) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter Space Separated Digits:: ");
        String[] strDigits = br.readLine().split(" ");

        int[] digits = new int[strDigits.length];
        for(int i = 0; i < strDigits.length; i++)
            digits[i] = Integer.parseInt(strDigits[i]);

        System.out.println(new LargestMultipleOfThree().largestMultipleOfThree(digits));

    }

    public String largestMultipleOfThree(int[] digits) {
        Arrays.sort(digits);
        List<Integer> remain1Indices = new ArrayList<>(2); // Indices of up to 2 elements with remainder = 1
        List<Integer> remain2Indices = new ArrayList<>(2); // Indices of up to 2 elements with remainder = 2
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 3 == 1 && remain1Indices.size() < 2) remain1Indices.add(i);
            else if (digits[i] % 3 == 2 && remain2Indices.size() < 2) remain2Indices.add(i);
        }
        int remainSum = Arrays.stream(digits).sum() % 3;
        if (remainSum == 1) { // Delete 1 smallest digit with remainder = 1 or Delete 2 smallest digits the remainder = 2
            if (remain1Indices.size() >= 1) return getResult(digits, remain1Indices.get(0), -1);
            else return getResult(digits, remain2Indices.get(0), remain2Indices.get(1));
        } else if (remainSum == 2) { // Delete 1 smallest digit with remainder = 2 or Delete 2 smallest digits with remainder = 1
            if (remain2Indices.size() >= 1) return getResult(digits, remain2Indices.get(0), -1);
            else return getResult(digits, remain1Indices.get(0), remain1Indices.get(1));
        }
        return getResult(digits, -1, -1);
    }
    private String getResult(int[] digits, int ban1, int ban2) {
        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == ban1 || i == ban2) continue; // Skip banned digits
            sb.append(digits[i]);
        }
        if (sb.length() > 0 && sb.charAt(0) == '0') return "0"; // Remove leading 0 case [0,...,0]
        return sb.toString();
    }
}
