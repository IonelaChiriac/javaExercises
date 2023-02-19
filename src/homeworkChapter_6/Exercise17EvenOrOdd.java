package homeworkChapter_6;

//6.17 (Even or Odd)
// Write a method isEven that uses the remainder operator (%) to determine whether an integer is even.
// The method should take an integer argument and return true if the integer is even and false otherwise.
// Incorporate this method into an application that inputs a sequence of integers
// (one at a time) and determines whether each is even or odd.


import java.util.Scanner;

public class Exercise17EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");

        //read an integer input from the user and store it in a variable named number
        int number = scanner.nextInt();
        scanner.close();

        System.out.printf("%nIs %d even? %s", number, isEven(number));
    }
    //define a method named isEven that takes an integer as a parameter and returns a boolean value
    //check if the number is even or not using the modulus operator and return true if it is even and false if it is odd
    public static boolean isEven(int number) {return number % 2 == 0 ? true : false;}
}

//output
//Please enter an integer: 8
//
//Is 8 even? true