package homeworkChapter_7;

//7.12 (Duplicate Elimination)
// Use a one-dimensional array to solve the following problem:
//Write an application that scanners five numbers, each between 10 and 100, inclusive.
// As each number is read, display it only if it’s not a duplicate of a number already read.
// Provide for the “worst case,” in which all five numbers are different.
// Use the smallest possible array to solve this problem.
// Display the complete set of unique values scanner after the user enters each new value.


import java.util.Scanner;

public class Exercise12DuplicateElimination {

    public static void main(String[] args) {
        //	Declare the variables and initialize
        int i;
        int index = 0;
        int myNumber;

        int[] myArray = new int[20];

        Scanner scanner = new Scanner(System.in);

        //prom user for scanner
        System.out.print("Program which displays the unique numbers entered.\n");

        //read the numbers
        for (int count = 1; count <= 20; count++) {
            //prom user for a number and then read a number
            System.out.println("\nPlease enter number " + count + ":");
            myNumber = scanner.nextInt();
            //check for the number to be in the range 10 and 100, inclusive
            if (myNumber < 10 || myNumber > 100) {
                //valid range
                System.out.println("\tInvalid range!");
                //continue with a new iteration
                continue;
            }
            //search in the array for the existence of the number
            for (i = 0; i < index; i++) {
                if (myArray[i] == myNumber)
                    break;
            }
            //store the number in the array when not exists
            if (i == index) {
                myArray[index] = myNumber;
                index++;
            } else
                System.out.println("\tDuplicate!");
        }
        //output the unique numbers the user entered
        System.out.println("Unique numbers in the array are as follows: \n");
        for (i = 0; i < index; i++)

            System.out.print("\t " + myArray[i]);
        scanner.close();
    }
}

//Program which displays the unique numbers entered.
//
//Please enter number 1:
//5
//	Invalid range!
//
//Please enter number 2:
//18
//
//Please enter number 3:
//25
//
//Please enter number 4:
//38
//
//Please enter number 5:
//44
//
//Please enter number 6:
//68
//
//Please enter number 7:
//38
//	Duplicate!
//
//Please enter number 8:
//44
//	Duplicate!
//
//Please enter number 9:
//99
//
//Please enter number 10:
//3
//	Invalid range!
//
//Please enter number 11:
//15
//
//Please enter number 12:
//12
//
//Please enter number 13:
//10
//
//Please enter number 14:
//3
//	Invalid range!
//
//Please enter number 15:
//1
//	Invalid range!
//
//Please enter number 16:
//20
//
//Please enter number 17:
//20
//	Duplicate!
//
//Please enter number 18:
//48
//
//Please enter number 19:
//44
//	Duplicate!
//
//Please enter number 20:
//98

//Unique numbers in the array are as follows:
//	 18	 25	 38	 44	 68	 99	 15	 12	 10	 20	 48	 98
