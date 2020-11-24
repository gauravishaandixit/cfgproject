import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToInteger {

    public static void main(String [] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter a String to convert to Integer!!!");
        String str = br.readLine();
        System.out.println(new StringToInteger().convert(str));
    }

    int convert(String str) {
        str = str.trim();
        if(str.length() == 0 || str == null)
            return 0;
        int neg = 1;
        boolean ne = false;
        if(str.charAt(0) == '-')
        {
            neg = -1;
            ne = true;
            str = str.substring(1);
        }

        if(str.length() == 0 || str == null)
            return 0;

        if(str.charAt(0) == '+' && !ne)
        {
            neg = 1;
            str = str.substring(1);
        }

        if(str.length() == 0 || str == null)
            return 0;

        if(!Character.isDigit(str.charAt(0)))
            return 0;

        String s[] = str.split("\\s");

        int i = 0;
        String st = "";
        while(i < str.length() && Character.isDigit(str.charAt(i)))
            st += str.charAt(i++);
        long num = 0;
        try
        {
            num = Long.parseLong(st) * neg;
        }
        catch(Exception ex)
        {
            if(ne)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
        if(num > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(num < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int)num;
    }
}
