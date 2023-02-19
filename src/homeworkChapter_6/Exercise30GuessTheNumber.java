package homeworkChapter_6;

//6.30 (Guess the Number)
// Write an application that plays “guess the number” as follows:
// Your program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//The application displays the prompt Guess a number between 1 and 1000.
// The player inputs a first guess.
// If the player's guess is incorrect, your program should display Too high. Try again. or Too low. Try again.
// to help the player “zero in” on the correct answer.
// The program should prompt the user for the next guess.
// When the user enters the correct answer, display Congratulations.
// You guessed the number!, and allow the user to choose whether to play again.
// [Note: The guessing technique employed in this problem is similar to a binary search, which is discussed in Chapter 19, Searching, Sorting and Big O.]


import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise30GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();


        //variable checks if user wants to stop playing the game
        int check = 0;

        System.out.println("Guess the number!");

        while(check != 1) {
            System.out.println("Please guess a number between 1 and 10: ");
            int guess = input.nextInt(); //variable guess stores the player's guess

            //generating the random number
            int rand = 1 + random.nextInt(10);

            //loop helps player guess number easily by reducing the range of options
            while(guess != rand) {
                if(guess > rand)
                    System.out.println("Too high, try again");
                else if(guess < rand)
                    System.out.println("Too low, try again");
                guess = input.nextInt(); //allows player to guess again
            }

            System.out.println("Congratulation!!\nYou Won!!!");
            //asks user if he/she wants to play again
            System.out.println("Please enter 0 to play again or 1 to quit");
            check  = input.nextInt();
        }
        input.close();
    }
}


//output
//Guess the number!
//Please guess a number between 1 and 10:
//5
//Too low, try again
//8
//Too high, try again
//7
//Congratulation!!
//You Won!!!
//Please enter 0 to play again or 1 to quit
//1
//
//Process finished with exit code 0