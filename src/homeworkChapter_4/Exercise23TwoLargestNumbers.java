package homeworkChapter_4;

//4.23 (Find the Two Largest Numbers)
// Using an approach similar to that for Exercise 4.21, find the two largest values of the 10 values entered.
// [Note: You may input each number only once.]

import java.util.Scanner;
public class Exercise23TwoLargestNumbers {
    // main method

    public static void main(String[] args) {

// Declare the variables
        int counter = 0;
        int number = 0;
        int largest = 0;
        int secondLargest = 0;

// create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

//loop for 10 values
        while (counter < 10) {

// prompt and read a input number from the user
            System.out.print("Please enter number " + (counter + 1) + " : ");
            number = keyboard.nextInt();

// check the number is greater than the largest
            if (number > largest) {

// store the largest to the second largest
                secondLargest = largest;

// store the number to largest
                largest = number;
            } else {
// check the number is less than the largest
                if (number < largest)

// check the number is greater than the secondlargest
                    if (number > secondLargest)
// store the number to the secondlargest
                        secondLargest = number;
            }

// increment counter
            counter = counter + 1;
        }

// display the largest number
        System.out.println("Largest in the group is: " + largest);

// display the second largest number
        System.out.println("Second largest in the group is: " + secondLargest);
    }
}

//output
//        Please enter number 1 : 1
//        Please enter number 2 : 2
//        Please enter number 3 : 3
//        Please enter number 4 : 4
//        Please enter number 5 : 5
//        Please enter number 6 : 6
//        Please enter number 7 : 7
//        Please enter number 8 : 8
//        Please enter number 9 : 9
//        Please enter number 10 : 10
//        Largest in the group is: 10
//        Second largest in the group is: 9