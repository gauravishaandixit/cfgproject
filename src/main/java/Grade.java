import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Grade {
    public static void main(String[] ar) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter marks of 4 subjects:: ");
        String[] strMarks = br.readLine().split(" ");
        int[] marks = new int[strMarks.length];
        for(int i = 0; i < strMarks.length; i++)
            marks[i] = Integer.parseInt(strMarks[i]);

        System.out.println(new Grade().calculateGrade(marks));
    }

    char calculateGrade(int[] marks)
    {
        double avg = Arrays.stream(marks).sum()/4.0;
        if(avg>=80)
        {
            return 'A';
        }
        else if(avg>=60 && avg<80)
        {
            return 'B';
        }
        else if(avg>=40 && avg<60)
        {
            return 'C';
        }
        else
        {
            return 'D';
        }
    }
}
