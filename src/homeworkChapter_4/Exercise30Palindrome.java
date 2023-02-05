package homeworkChapter_4;

import java.util.Scanner;

//4.30 (Palindromes)
// A palindrome is a sequence of characters that reads the same backward as forward.
// For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611.
// Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
// If the number is not five digits long, display an error message and allow the user to enter a new value.

public class Exercise30Palindrome {

    public static void main(String[] args)
    {
//declare the necessary variables
        String number;
        String number_copy;
        String reverse = "";

//create a Scanner object to get the input from the user
        Scanner keyboard = new Scanner(System.in);

//do-while loop
        do
        {
//prompt the user to enter the five-digit number
            System.out.println("Please enter a "+ "five-digit number to check if "+ "it is a palindrome or not: ");

//read the input from the user
            number = keyboard.nextLine();

//use if condition to check whether
//it is a five-digit number or not
            if(number.length()!=5)
            {
                System.out.println("Error! Please enter" + " the Five-digit number");
            }
        }while (number.length()!=5);

//check the condition
//declare the temporary variable
        number_copy = number;
        int length = number_copy.length();

//use for loop to check whether the
//input is palindrome or not
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + number.charAt(i);

//use if condition to display
//if it is a palindrome or not
        if (number_copy.equals(reverse))
            System.out.println( number_copy + " is a palindrome.");
        else
            System.out.println( number_copy + " is not a palindrome.");
    }
}

//output

//        Please enter a five-digit number to check if it is a palindrome or not:
//        12321
//        12321 is a palindrome.

//        Please enter a five-digit number to check if it is a palindrome or not:
//        123456
//        Error! Please enter the Five-digit number
//        Please enter a five-digit number to check if it is a palindrome or not:
//        12345
//        12345 is not a palindrome.