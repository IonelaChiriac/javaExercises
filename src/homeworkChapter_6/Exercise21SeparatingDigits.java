package homeworkChapter_6;

//6.21 (Separating Digits)
// Write methods that accomplish each of the following tasks:
//a) Calculate the integer part of the quotient when integer a is divided by integer b.
//b) Calculate the integer remainder when integer a is divided by integer b.
//c) Use the methods developed in parts (a) and (b) to write a method displayDigits that
//receives an integer between 1 and 99999 and displays it as a sequence of digits, separating
//each pair of digits by two spaces. For example, the integer 4562 should appear as
//4 5 6 2
//Incorporate the methods into an application that inputs an integer and calls displayDigits
//by passing the method the integer entered.
//Display the results.


import java.util.Scanner;

public class Exercise21SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        do {
            System.out.print("Please enter a number between 1 and 99999: ");
            number = input.nextInt();
            //repeat the loop until the user enters a number between 1 and 99999
        } while (number < 1 || number > 99999);
        input.close();

        //call the displayDigits method and pass the user input as an argument
        displayDigits(number);
    }

    //define a method that takes two integers as arguments and returns their quotient
    public static int quotient(int a, int b) {
        return a / b;
    }

    //define a method that takes two integers as arguments and returns their remainder
    public static int rem(int a, int b) {
        return a % b;
    }

    //define a method that takes an integer as an argument
    public static void displayDigits(int number) {
        //declare a String variable to store the result
        String result = "";
        //start a while loop that runs as long as number is not equal to zero
        while (number != 0) {
            //get the remainder when number is divided by 10
            int rem = rem(number, 10);
            //get the quotient when number is divided by 10
            number = quotient(number, 10);
            //add the remainder to the result string
            result = rem + "  " + result;
        }
        System.out.println(result);
    }
}

//output
//Please enter a number between 1 and 99999: 9999
//9  9  9  9


