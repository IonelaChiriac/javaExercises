package homeworkChapter_4;

import java.util.Scanner;

//4.21 (Find the Largest Number)
// The process of finding the largest value is used frequently in computer applications.
// For example, a program that determines the winner of a sales contest would input
// the number of units sold by each salesperson.
// The salesperson who sells the most units wins the contest.
// Write a pseudocode program, then a Java application that inputs a series of 10 integers
// and determines and prints the largest integer.
// Your program should use at least the following three variables:
// a) counter: A counter to count to 10
// (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed).
// b) number: The integer most recently input by the user.
// c) largest: The largest number found so far.

public class Exercise21LargestNumber {

    public static void main(String[] args) {

//declare and initialize three local variables
        int counter = 10;
        int number;
        int largest = 0;

// create a Scanner object for keyboard input.
        Scanner obj = new Scanner(System.in);

// prompt user for data
        System.out.println("Please enter 10 numbers");
        while (counter > 0) {

//read data from keyboard
            number = obj.nextInt();
            if (largest < number)
//store number to largest
                largest = number;
//decrement counter
            counter = counter - 1;
        }

//print the largest number.
        System.out.println("The largest in the group is : " + largest);

    }
}

//output
//        Please enter 10 numbers
//        1
//        5
//        10
//        15
//        33
//        58
//        6
//        77
//        98
//        85
//        The largest in the group is : 98