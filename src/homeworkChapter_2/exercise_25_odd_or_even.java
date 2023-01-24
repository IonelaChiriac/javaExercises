package homeworkChapter_2;

import java.util.Scanner;

// Write an application that reads an integer and determines and prints whether it’s odd or even.
// Hint: Use the remainder operator.
// An even number is a multiple of 2.
// Any multiple of 2 leaves a remainder of 0 when divided by 2.

public class exercise_25_odd_or_even {

        // main method begins execution of Java application
        public static void main(String[] args)
        {
            // create Scanner to obtain input from command line
            Scanner input = new Scanner(System.in);

            int oddEvenNumber;
            System.out.print("Please enter a number: ");
            oddEvenNumber = input.nextInt();

            if((oddEvenNumber % 2) == 0)
                System.out.println("This is an even number");

            if((oddEvenNumber % 2) != 0)
                System.out.println("This is an odd number");
        }

}

//output
//        Please enter a number: 3
//        This is an odd number

//        Please enter a number: 2
//        This is an even number