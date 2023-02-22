package homeworkChapter_7;

//7.18 (Game of Craps)
// Write an application that runs 1,000,000 games of craps (Fig. 6.8) and
//answers the following questions:
//a) How many games are won on the first roll, second roll, …, twentieth roll and after the
//twentieth roll?
//b) How many games are lost on the first roll, second roll, …, twentieth roll and after the
//twentieth roll?
//c) What are the chances of winning at craps? [Note: You should discover that craps is one
//of the fairest casino games. What do you suppose this means?]
//d) What is the average length of a game of craps?
//e) Do the chances of winning improve with the length of the game?


import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise18GameOfCraps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    //declares an enumeration named Status, which will be used to keep track of the game's current status
    private enum Status {NEW, CONTINUE, WON, LOST}

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus = Status.NEW;
        int sumOfDice = rollDice();
        int bankBalance = 1000;
        int wager = wagerPlacement(bankBalance);

        //determines the initial status of the game
        //if the current status is NEW, it checks the sum of the dice rolled in the first turn
        //if the sum is 7 or 11, the game is won;
        //if the sum is 2, 3, or 12, the game is lost
        //otherwise, the game is in progress and the status is set to CONTINUE
        //if the current status is not NEW, the sum of the dice is set as the new "point"
        if (gameStatus == Status.NEW) {
            if (sumOfDice == 7 || sumOfDice == 11) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12) {
                gameStatus = Status.LOST;
            }
            gameStatus = Status.CONTINUE;
        } else {
            myPoint = sumOfDice;
            System.out.printf("Point is %d%n", myPoint);
        }
        //loop runs as long as the game is in progress (gameStatus is CONTINUE)
        //in each iteration, the dice are rolled again, and the sum is compared to the current "point"
        //if the sum matches the point, the game is won; if the sum is 7, the game is lost
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice(); // roll dice again
            // determine game status
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
            } else if (sumOfDice == 7) {
                gameStatus = Status.LOST;
            }
        }

        if (gameStatus == Status.WON) {
            System.out.println("Player wins");
            bankBalance += wager;
        } else {
            System.out.println("Player loses");
            bankBalance -= wager;
        }
        System.out.printf("%d%n", bankBalance);
        chatter();

        if (bankBalance == 0) {
            System.out.println("Sorry. You busted!");
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static int wagerPlacement(int bankBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a wager");
        int wager = scanner.nextInt();

        if (!(wager <= bankBalance)) {
            System.out.println("Reenter wager");
            wager = scanner.nextInt();
        }
        return wager;
    }

    public static void chatter() {
        String[] chatter = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!", "You're up big. Now's the time to cash in your chips!"};
        SecureRandom chatterString = new SecureRandom();

        int k = chatterString.nextInt(3);
        System.out.println(chatter[k]);
    }
}

//output
//Player rolled 5 + 1 = 6
//Enter a wager
//29
//Player rolled 3 + 2 = 5
//Player rolled 1 + 3 = 4
//Player rolled 5 + 2 = 7
//Player loses
//971
//You're up big. Now's the time to cash in your chips!

//Player rolled 4 + 5 = 9
//Enter a wager
//5
//Player rolled 1 + 3 = 4
//Player rolled 1 + 4 = 5
//Player rolled 2 + 3 = 5
//Player rolled 3 + 6 = 9
//Player rolled 3 + 6 = 9
//Player rolled 5 + 2 = 7
//Player loses
//995
//Oh, you're going for broke, huh?

//Player rolled 3 + 4 = 7
//Enter a wager
//58
//Player rolled 1 + 6 = 7
//Player loses
//942
//Aw c'mon, take a chance!