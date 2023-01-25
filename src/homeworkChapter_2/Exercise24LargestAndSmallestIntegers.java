package homeworkChapter_2;

import java.util.Scanner;

//2.24 (Largest and Smallest Integers) Write an application that reads five integers
// and determines and prints the largest and smallest integers in the group.
// Use only the programming techniques you learned in this chapter.
public class Exercise24LargestAndSmallestIntegers {

        // main method begins execution of Java application
        public static void main(String[] args)
        {
            // create Scanner to obtain input from command line
            Scanner input = new Scanner(System.in);
            int firstNumber; // first number to compare
            int secondNumber; // second number to compare
            int thirdNumber; // third number to compare
            int fourthNumber; // fourth number to compare
            int fifthNumber; // fifth number to compare

            int largest;
            int smallest;

            System.out.print("Please enter the first number: "); // prompt
            firstNumber = input.nextInt(); // read first number from user

            System.out.print("Please enter the second number: "); // prompt
            secondNumber = input.nextInt(); // read second number from user

            System.out.print("Please enter the third number: "); // prompt
            thirdNumber = input.nextInt(); // read third number from user

            System.out.print("Please enter the fourth number: "); // prompt
            fourthNumber = input.nextInt(); // read fourth number from user

            System.out.print("Please enter the fifth number: "); // prompt
            fifthNumber = input.nextInt(); // read fifth number from user

            largest = firstNumber;
            if(secondNumber > firstNumber) largest = secondNumber;
            if(thirdNumber > largest) largest = thirdNumber;
            if(fourthNumber > largest) largest = fourthNumber;
            if(fifthNumber > largest) largest = fifthNumber;

            smallest = firstNumber;
            if(secondNumber < firstNumber) smallest = secondNumber;
            if(thirdNumber < smallest) smallest = thirdNumber;
            if(fourthNumber < smallest) smallest = fourthNumber;
            if(fifthNumber < smallest) smallest = fifthNumber;

            System.out.println("Largest number is " + largest);
            System.out.println("Smallest number is " + smallest);
        }
}

//output
//        Please enter the first number: 50
//        Please enter the second number: 20
//        Please enter the third number: 30
//        Please enter the fourth number: 10
//        Please enter the fifth number: 40
//        Largest number is 50
//        Smallest number is 10