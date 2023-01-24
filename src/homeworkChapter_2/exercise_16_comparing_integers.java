package homeworkChapter_2;

import java.util.Scanner;

//2.16 (Comparing Integers) Write an application that asks the user to enter two integers,
//obtains them from the user and
// displays the larger number followed by the words "is larger".
// If the numbers are equal, print the message "These numbers are equal".
// Use the techniques shown in Fig. 2.15.
public class exercise_16_comparing_integers {

        // main method begins execution of Java application
        public static void main(String[] args)
        {
            // create Scanner to obtain input from command line
            Scanner input = new Scanner(System.in);
            int planetsSolarSystem; // first number to compare
            int planetsUniverse; // second number to compare

            System.out.print("Please enter how many planets are in our solar system: "); // prompt
            planetsSolarSystem = input.nextInt(); // read first number from user

            System.out.print("Please enter how many planets do you think are in our galaxy: "); // prompt
            planetsUniverse = input.nextInt(); // read second number from user

            if (planetsSolarSystem < planetsUniverse)
                System.out.printf("%d is larger!", planetsUniverse);

            if (planetsSolarSystem > planetsUniverse)
                System.out.printf("%d is larger!", planetsSolarSystem);

            if (planetsSolarSystem == planetsUniverse)
                System.out.printf("These numbers are equal");
        }// end method main
    }// end class Comparison

//INTEGER data type stores whole numbers that range from-2,147,483,647 to 2,147,483,647 for 9 or 10 digits of precision.

//output
//        Please enter how many planets are in our solar system: 8
//        Please enter how many planets do you think are in our galaxy: 100000000
//        100000000 is larger!

//        Please enter how many planets are in our solar system: 8
//        Please enter how many planets do you think are in our galaxy: 8
//        These numbers are equal