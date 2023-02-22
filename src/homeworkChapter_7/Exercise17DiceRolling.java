package homeworkChapter_7;

//7.17 (Dice Rolling)
// Write an application to simulate the rolling of two dice. The application
//should use an object of class Random once to roll the first die and again to roll the second die.
//The sum of the two values should then be calculated. Each die can show an integer value from 1 to 6,
//so the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent.
//Figure 7.28 shows the 36 possible combinations of the two dice.
//Your application should roll the dice 36,000,000 times.
//Use a one-dimensional array to tally the number of times each possible sum appears.
//Display the results in tabular format.

import java.security.SecureRandom;

public class Exercise17DiceRolling {

    //initializes a new static, final instance of the SecureRandom class,
    // which will be used to generate random numbers for simulating the dice rolls
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        //initializes a new integer array called frequency with a size of 13
        //the array will be used to count the frequency of each possible sum of the dice rolls, from 2 to 12
        int[] frequency = new int[13];
        //loop that will iterate 36 million times to simulate the dice rolls and count their frequency
        for (int i = 0; i < 36_000_000; i++) {
            //generates a random number between 1 and 6 (inclusive) to simulate the roll of the first die
            int die1 = 1 + random.nextInt(6);
            int die2 = 1 + random.nextInt(6);

            //calculates the sum of the two dice rolls
            int sum = die1 + die2;
            //increments the element of the frequency array at the index corresponding to the sum of the two dice rolls
            ++frequency[sum];
        }

        System.out.printf("%s %s%n", "Sum", "Frequency");
        //loop that will iterate over the frequency array and print the frequency of each possible sum, starting with 2 and ending with 12
        for (int i = 2; i < frequency.length; i++) {
            System.out.printf("%2d %10d%n", i, frequency[i]);
        }
    }
}

//Sum Frequency
// 2    1001297
// 3    2000898
// 4    2998336
// 5    4000751
// 6    5001918
// 7    5999177
// 8    4995850
// 9    3998863
//10    3001916
//11    2000934
//12    1000060