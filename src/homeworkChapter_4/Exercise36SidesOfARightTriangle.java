package homeworkChapter_4;
//4.35(Sides of a Triangle)
//Write an application that reads three nonzero values entered by the user
//and determines and prints whether they could represent the sides of a triangle.
//4.36 (Sides of a Right Triangle)
//Write an application that reads three nonzero integers and determines
//and prints whether they could represent the sides of a right triangle.

import java.util.Scanner;

public class Exercise36SidesOfARightTriangle {
    public static void main(String[] args) {
        int side1, // length of side 1
                side2, // length of side 2
                side3; // length of side 3
        String result; // output String
        //scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        //input side 1
        System.out.print("Please enter the length of side 1: ");
        side1 = keyboard.nextInt();

        //input side 2
        System.out.print("Please enter the length of side 2: ");
        side2 = keyboard.nextInt();

        //input side 3
        System.out.print("Please enter the length of side 3: ");
        side3 = keyboard.nextInt();

        int side1Square = side1 * side1;
        int side2Square = side2 * side2;
        int side3Square = side3 * side3;
        result = "These do not form a right triangle. ";
        if ((side1Square + side2Square) == side3Square) result = "These are the sides of a right triangle .";
        if ((side1Square + side3Square) == side2Square) result = "These are the sides of a right triangle .";
        if ((side2Square + side3Square) == side1Square) result = "These are the sides of a right triangle. ";

        System.out.print(result);
        System.exit(0);
    }
}

//output
//Please enter the length of side 1: 5
//Please enter the length of side 2: 4
//Please enter the length of side 3: 3
//These are the sides of a right triangle.

//Please enter the length of side 1: 1
//Please enter the length of side 2: 2
//Please enter the length of side 3: 3
//These do not form a right triangle.