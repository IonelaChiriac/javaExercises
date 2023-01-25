package homeworkChapter_2;

import java.util.Scanner;

//(Multiples) Write an application that reads two integers,
//determines whether the first is a multiple of the second
//and prints the result. [Hint: Use the remainder operator.]
public class Exercise26Multiples {

        // main method begins execution of Java application
        public static void main(String[] args)
        {
            // create Scanner to obtain input from command line
            Scanner input = new Scanner(System.in);

            int firstNumber;
            int secondNumber;

            System.out.print("Please enter the first number: ");
            firstNumber = input.nextInt();

            System.out.print("Please enter the second number: ");
            secondNumber = input.nextInt();

            if(firstNumber % secondNumber == 0)
                System.out.print("Second number is a multiple of the firstNumber");

            if(secondNumber % firstNumber == 0)
                System.out.print("First number is a multiple of the secondNumber");
        }


}

//output
//        Please enter the first number: 15
//        Please enter the second number: 3
//        Second number is a multiple of the firstNumber

//        Please enter the first number: 3
//        Please enter the second number: 15
//        First number is a multiple of the secondNumber