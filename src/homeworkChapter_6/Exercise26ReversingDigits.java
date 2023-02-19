package homeworkChapter_6;

//6.26 (Reversing Digits)
// Write a method that takes an integer value and returns the number with its digits reversed.
// For example, given the number 7631, the method should return 1367.
// Incorporate the method into an application that reads a value from the user and displays the result.


import java.util.Scanner;

public class Exercise26ReversingDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int value = input.nextInt();
        input.close();

        System.out.println(reverse(value));
    }
    //method that reverses the digits of an integer
    public static int reverse(int value) {
        //initialize a variable to hold the reversed digits
        int reverted = 0;

        while (value != 0) {
            //get the last digit of the integer by using modulo operator
            int rem = value % 10;
            //remove the last digit by dividing the integer by 10
            value /= 10;
            //append the last digit to the reversed variable
            reverted = rem + 10 * reverted;
        }
        return reverted;
    }
}

//output
//Please enter an integer: 7631
//1367