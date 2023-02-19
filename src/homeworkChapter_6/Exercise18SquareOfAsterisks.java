package homeworkChapter_6;

//6.18
// (Displaying a Square of Asterisks)
// Write a method squareOfAsterisks that displays a solid square
//(the same number of rows and columns) of asterisks whose side is specified in integer parameter side.
// For example, if side is 4, the method should display
//****
//****
//****
//****

//Incorporate this method into an application that reads an integer value for side from the user and
//outputs the asterisks with the squareOfAsterisks method.


import java.util.Scanner;

public class Exercise18SquareOfAsterisks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the side of square: ");
        //reading the input provided by the user and storing it in a variable named 'side'
        int side = scanner.nextInt();
        scanner.close();

        //calling the method 'squareOfAsterisks' and passing the user-provided value of side as an argument
        squareOfAsterisks(side);
    }

    //defining a method named 'squareOfAsterisks' that takes an integer argument 'side' and returns void
    public static void squareOfAsterisks(int side) {
        //for loop to print a square of asterisks with 'side' rows and 'side' columns
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

//output
//Please enter the side of square: 5
//*****
//*****
//*****
//*****
//*****

