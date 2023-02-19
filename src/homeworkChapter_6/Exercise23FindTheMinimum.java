package homeworkChapter_6;


//6.23 (Find the Minimum)
// Write a method minimum3 that returns the smallest of three floating point numbers.
// Use the Math.min method to implement minimum3.
// Incorporate the method into an application
// that reads three values from the user,
// determines the smallest value
// and displays the result.


import java.util.Scanner;

public class Exercise23FindTheMinimum {
    public static void main(String[] args) {
        float num1, num2, num3, small;
        //scanner to obtain input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 floating point numbers to determine the minimum:");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        num3 = input.nextFloat();

        //calls the minimum3 method passing num1, num2, num3 as arguments and stores the returned value in small variable
        small = minimum3(num1, num2, num3);

        System.out.println("Smallest floating point number is: " + small);

        System.exit(0);
    }

    //declares a public static method named minimum3 which returns a float value and takes three float arguments
    public static float minimum3(float one, float two, float three) {
        //finds the minimum of the three input values and stores the result in the x variable
        float x = Math.min(Math.min(one, two), three);
        return x;
    }
}


//output
//Please enter 3 floating point numbers to determine the minimum:
//5.6
//5.7
//5.2
//Smallest floating point number is: 5.2


