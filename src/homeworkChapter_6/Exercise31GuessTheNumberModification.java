package homeworkChapter_6;

//6.31 (Guess the Number Modification)
//Modify the program of Exercise 6.30 to count the number of guesses the player makes.
// If the number is 10 or fewer, display Either you know the secret or you got lucky!
//If the player guesses the number in 10 tries, display Aha! You know the secret!
//If the player makes more than 10 guesses, display You should be able to do better!
// Why should it take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
//half of the numbers, then half of the remaining numbers, and so on.

import java.security.SecureRandom;
import java.util.Scanner;


public class Exercise31GuessTheNumberModification {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create a SecureRandom object for generating random numbers
        SecureRandom random = new SecureRandom();

        //variable to check if the user wants to stop playing the game
        int check = 0;

        System.out.println("Guess the number!");

        //loop to keep playing the game until the user decides to quit
        while(check != 1) {
            //variable to count the number of guesses the user makes
            int guessCount = 0;
            System.out.println("Please guess a number between 1 and 10: ");
            //read the user's guess
            int guess = input.nextInt();

            //generate a random number between 1 and 10
            int rand = 1 + random.nextInt(10);

            //loop to keep asking the user to guess until they get it right
            while(guess != rand) {
                if(guess > rand)
                    System.out.println("Too high, try again");
                else if(guess < rand)
                    System.out.println("Too low, try again");
                //read the user's guess again
                guess = input.nextInt();
                //increment the guess count
                guessCount++;
            }

            //increment the guess count for the correct guess
            guessCount++;
            //if the user guessed in 10 or fewer tries
            if(guessCount <= 10) {
                if(guessCount == 1)
                    //if the user guessed in one try
                    System.out.println("Either you know the secret or you got lucky!");
                else
                    //if the user guessed in 10 or fewer tries, but not in one try
                    System.out.println("Aha! You know the secret!");
            }
            else {
                //if the user guessed in more than 10 tries
                System.out.println("You should be able to do better!");
            }
            //ask the user if they want to play again or quit
            System.out.println("Please enter 0 to play again or 1 to quit");
            check  = input.nextInt();
        }
        input.close();
    }
}

//output
//Guess the number!
//Please guess a number between 1 and 10:
//2
//Too low, try again
//5
//Too low, try again
//8
//Too low, try again
//9
//Too low, try again
//10
//Aha! You know the secret!
//Please enter 0 to play again or 1 to quit
//1
//
//Process finished with exit code 0
