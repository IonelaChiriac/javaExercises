package homeworkChapter_6;

//6.16 (Multiples)
//Write a method isMultiple that determines, for a pair of integers,
//whether the second integer is a multiple of the first.
//The method should take two integer arguments and return
//true if the second is a multiple of the first and false otherwise.
//[Hint: Use the remainder operator.]
//Incorporate this method into an application that inputs a series of pairs of integers
// (one pair at a time) and determines whether the second value in each pair is a multiple of the first.

import java.util.Scanner;
public class Exercise16Multiples {

        public static void main(String[] args) {

            //new Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            //user to enter an integer
            System.out.print("Please enter an integer: ");

            //read the integer entered by the user and store it in variable number1
            int number1 = scanner.nextInt();

            //user to enter another integer
            System.out.print("Please enter another integer: ");

            //read the integer entered by the user and store it in variable number2
            int number2 = scanner.nextInt();

            //close the Scanner object
            scanner.close();

            //print the result of the isMultiple method
            System.out.printf("%n%d is a multiple of %d? %s", number2, number1, isMultiple(number1, number2));
        }

        //create a static method called isMultiple that takes two integers as parameters
        public static boolean isMultiple(int number1, int number2) {

            //return true if number2 is a multiple of number1, otherwise return false
            return number2 % number1 == 0 ? true : false;
        }
    }


//output
//Please enter an integer: 5
//Please enter another integer: 8
//
//8 is a multiple of 5? false
//Process finished with exit code 0