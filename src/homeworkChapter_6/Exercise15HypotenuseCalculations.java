package homeworkChapter_6;

//6.15 (Hypotenuse Calculations)
// Define a method hypotenuse that calculates the hypotenuse
// of a right triangle when the lengths of the other two sides are given.
// The method should take two arguments of type double and return the hypotenuse as a double.
// Incorporate this method into an application that reads values for side1 and side2
//and performs the calculation with the hypotenuse method.
// Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the triangles in Fig. 6.15.
// [Note: Class Math also provides method hypotenuse to perform this calculation.]

//Triangle    Side 1        Side 2
//1           3.0           4.0
//2           5.0           12.0
//3           8.0           15.0

import java.util.Scanner;

public class Exercise15HypotenuseCalculations {
    public static void main(String[] args) {

        //create a new Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        //loop three times to get input for three triangles
        for (int i = 1; i <= 3; i++) {
            //enter the first side of the current triangle
            System.out.printf("Please enter side 1 for triangle %d: ", i);
            //read input and store it in a variable
            double side1 = input.nextDouble();

            System.out.printf("Please enter side 2 for triangle %d: ", i);
            double side2 = input.nextDouble();

            //calculate the hypotenuse of the current triangle using the hypotenuse() method
            double hypotenuse = hypotenuse(side1, side2);

            //output a header for the triangle's data
            System.out.printf("Triangle\tSide 1\t\tSide 2\t\tHypotenuse%n");
            //output the data for the current triangle
            System.out.printf("%d\t\t\t%.2f\t\t%.2f\t\t%.2f%n%n", i, side1, side2, hypotenuse);

        }
    }

    //method to calculate the hypotenuse of a triangle given its two sides
    public static double hypotenuse(double side1, double side2) {
        //calculate the hypotenuse using the Pythagorean theorem
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }
}


//final output
//Please enter side 1 for triangle 1: 3.0
//Please enter side 2 for triangle 1: 4.0
//Triangle	Side 1		Side 2		Hypotenuse
//1			3.00		4.00		5.00

//Please enter side 1 for triangle 2: 5.0
//Please enter side 2 for triangle 2: 12.0
//Triangle	Side 1		Side 2		Hypotenuse
//2			5.00		12.00		13.00

//Please enter side 1 for triangle 3: 8.0
//Please enter side 2 for triangle 3: 15.0
//Triangle	Side 1		Side 2		Hypotenuse
//3			8.00		15.00		17.00