import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartMenu {
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a choice according to the following:: ");
        System.out.println("1:: To Check Whether A String Is Valid Or Not. ");
        //System.out.println("Enter a choice according to the following:: ");
        //System.out.println("Enter a choice according to the following:: ");
        String ch = br.readLine();
        int choice = Integer.parseInt(ch);
        System.out.println("\n\nYou selected:: "+choice);

        switch (choice)
        {
            case 1: ValidNumber.main(null);
                    break;
            default: System.out.println("Wrong Choice Buddy!!!");
        }


    }
}
