package homeworkChapter_4;

//4.24 (Validating User Input)
// Modify the program in Fig. 4.12 to validate its inputs.
// For any input, if the value entered is other than 1 or 2,
// keep looping until the user enters a correct value.

import java.util.Scanner;

public class Exercise24ValidatingUserInput {
    public static void main(String[] args) {

        // initializing variables in declarations
        int passes = 0, failures = 0, student = 1, result;

        String input, output;
        //scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //process 10 students; counter-controlled loop
        while (student <= 10) {
            System.out.print("Please enter the result (1=pass, 2=fail) : ");
            result = keyboard.nextInt();
            if (result == 1) {
                //if...else nested in while
                passes++;
                student++;
            } else if (result == 2) {
                failures++;
                student++;
            } else
                System.out.println("Invalid input");
        }
        System.out.printf("Total students passed: " + passes + "\nTotal students failed: " + failures);

        if (passes > 8)
            System.out.println("\nBonus for the trainner!");
        System.exit(0);
    }
}

//output
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Total students passed: 10
//Total students failed: 0
//Bonus for the trainner!

//Please enter the result (1=pass, 2=fail) : 2
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 2
//Please enter the result (1=pass, 2=fail) : 2
//Please enter the result (1=pass, 2=fail) : 3
//Invalid input
//Please enter the result (1=pass, 2=fail) : 1
//Please enter the result (1=pass, 2=fail) : 6
//Invalid input
//Please enter the result (1=pass, 2=fail) : 2
//Please enter the result (1=pass, 2=fail) : 5
//Invalid input
//Please enter the result (1=pass, 2=fail) : 2
//Please enter the result (1=pass, 2=fail) : 2
//Please enter the result (1=pass, 2=fail) : 2
//Total students passed: 3
//Total students failed: 7

