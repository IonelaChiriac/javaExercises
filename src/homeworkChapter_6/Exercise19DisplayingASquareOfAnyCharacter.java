package homeworkChapter_6;

//6.19 (Displaying a Square of Any Character)
// Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter.
// Form the square using the char provided as an argument.
// Thus, if side is 5 and fillCharacter is #, the method should display
//#####
//#####
//#####
//#####
//#####
//Use the following statement (in which input is a Scanner object) to read a character from the user at the keyboard:
//char fill = input.next().charAt(0);

import java.util.Scanner;
public class Exercise19DisplayingASquareOfAnyCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the side of square: ");
        int side = input.nextInt();

        System.out.print("Please enter a character: ");
        char fill = input.next().charAt(0);
        input.close();

        //call the squareOf method and pass the side and fill variables as parameters
        squareOf(side, fill);
    }
    //create a static method named squareOf that takes an int and a char as parameters
    public static void squareOf(int side, char fillCharacter) {
        //use nested for loops to print a square of the specified side and character
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++)
                System.out.print(fillCharacter);

            System.out.println();
        }
    }
}

//output
//Please enter the side of square: 8
//Please enter a character: #
//########
//########
//########
//########
//########
//########
//########
//########