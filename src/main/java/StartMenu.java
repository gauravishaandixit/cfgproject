import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartMenu {
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int choice = -1;
        do {
            System.out.println("0:: Exit!!!");
            System.out.println("1:: To Check Whether A String Is Valid Or Not.!!!");
            System.out.println("2:: The largest multiple of three that can be formed by concatenating " +
                    "some of the given digits in any order!!!");
            System.out.println("3:: Convert a String to Integer!!!");
            System.out.print("Enter a choice according to the above menu:: ");
            String ch = br.readLine();
            choice = Integer.parseInt(ch);
            System.out.println("\n\nYou selected:: "+choice);

            mapChoiceToProgram(choice);

        }while (true);


    }

    static void mapChoiceToProgram(int choice) throws IOException
    {
        switch (choice)
        {
            case 0: System.exit(0);
                break;
            case 1: ValidNumber.main(null);
                break;
            case 2: LargestMultipleOfThree.main(null);
                break;
            case 3: StringToInteger.main(null);
                break;
            default: System.out.println("Wrong Choice Buddy!!!");
        }
    }
}
