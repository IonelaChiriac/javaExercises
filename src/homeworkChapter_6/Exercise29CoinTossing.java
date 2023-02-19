package homeworkChapter_6;

//6.29 (Coin Tossing)
// Write an application that simulates coin tossing.
// Let the program toss a coin each time the user chooses the “Toss Coin” menu option.
// Count the number of times each side of the coin appears.
// Display the results. The program should call a separate method flip
// that takes no arguments and returns a value from a Coin enum (HEADS and TAILS).
// [Note: If the program realistically simulates coin tossing, each side of the coin should appear approximately half the time.]

import java.util.Random;
import java.util.Scanner;

public class Exercise29CoinTossing {
    //define the Coin enum with HEADS and TAILS as its values
    private enum Coin {HEADS, TAILS};

    //declare and initialize a Random object as randomToss
    private static final Random randomToss = new Random();

    //declare an integer constant HEAD with a value of 1
    private static final int HEAD = 1;

    //define the main method
    public static void main(String[] args) {

        //Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        //declare and initialize integer variables to count total tosses, heads, and tails
        int totalTosses = 0;
        int totalHeads = 0;
        int totalTails = 0;

        //repeat the loop until user exits
        while (true) {

            //ask the user to choose an option
            System.out.println("Please select an option from the following menu: ");
            System.out.print(" 1. Toss the coin\n 2. End Game \n ");

            //read the input
            int inputToss = input.nextInt();

            //if the user chooses option 1, flip the coin and count the result
            if (inputToss == 1) {

                int CoinTossed = flip();

                if (CoinTossed == HEAD) {
                    totalHeads++;
                } else {
                    totalTails++;
                }

                totalTosses++;

                //if the user chooses option 2, display the results and exit the program
            } else if (inputToss == 2) {

                System.out.printf("You have tossed %d times\n", totalTosses);
                System.out.printf("Number of heads %d times\n", totalHeads);
                System.out.printf("Number of tails %d times \n", totalTails);

                System.exit(0);

                //if the user enters an invalid input, prompt the user to try again
            } else {
                System.err.println("Invalid input. Please try again.\n");
            }

            input.close();
        }
    }

    //define the flip method to return a random coin toss result
    public static int flip() {

        //generate a random integer in the range of 1 and 2 (inclusive)
        int toss = 1 + randomToss.nextInt(2);

        //print the result of the toss as either Head or Tail
        if (toss == HEAD) {
            System.out.println("It's Head!");
        } else {
            System.out.println("It's Tail!");
        }

        //return the result of the toss
        return toss;
    }
}

//output
//Please select an option from the following menu:
// 1. Toss the coin
// 2. End Game
// 1
//It's Tail!
//Please select an option from the following menu:
// 1. Toss the coin
// 2. End Game
// 1
//It's Tail!
//Please select an option from the following menu:
// 1. Toss the coin
// 2. End Game
// 1
//It's Head!
//Please select an option from the following menu:
// 1. Toss the coin
// 2. End Game
// 1
//It's Head!
//Please select an option from the following menu:
// 1. Toss the coin
// 2. End Game
// 1
//It's Tail!
//Please select an option from the following menu:
// 1. Toss the coin
// 2. End Game
// 2
//You have tossed 5 times
//Number of heads 2 times
//Number of tails 3 times
//
//Process finished with exit code 0