package homeworkChapter_2;

import java.util.Scanner;

//2.16 (Comparing Integers) Write an application that asks the user to enter two integers,
//obtains them from the user and
// displays the larger number followed by the words "is larger".
// If the numbers are equal, print the message "These numbers are equal".
// Use the techniques shown in Fig. 2.15.
public class exercise_17_arithmetic_smallest_and_largest {

        // main method begins execution of Java application
        public static void main(String[] args)
        {
            // create Scanner to obtain input from command line
            Scanner input = new Scanner(System.in);
            int planetsSolarSystem; // first number to compare
            int planetsGalaxy; // second number to compare
            int planetsUniverse; // third number to compare
            int sum;
            int average;
            int product;
            int largest;
            int smallest;

            System.out.print("Please enter how many planets are in our solar system: "); // prompt
            planetsSolarSystem = input.nextInt(); // read first number from user

            System.out.print("Please enter how many planets do you think that are in our galaxy: "); // prompt
            planetsGalaxy = input.nextInt(); // read second number from user

            System.out.print("Please enter how many planets do you think that are in the universe: "); // prompt
            planetsUniverse = input.nextInt(); // read third number from user

            //sum
            sum = planetsSolarSystem + planetsGalaxy + planetsUniverse;
            System.out.println("Sum of all the planets is " + sum);

            //average
            average = sum / 3;
            System.out.println("Average of all planets is " + average);

            //product
            product = planetsSolarSystem * planetsGalaxy * planetsUniverse;
            System.out.println("Product of all planets is " + product);

            //largest
            largest = planetsSolarSystem;
            if(planetsGalaxy > planetsSolarSystem) largest = planetsGalaxy;
            if(planetsUniverse > largest) largest = planetsUniverse;
            System.out.println("Largest number of planets is " + largest);

            //smallest
            smallest = planetsSolarSystem;
            if(planetsGalaxy < planetsSolarSystem) smallest = planetsGalaxy;
            if(planetsUniverse < smallest) smallest = planetsUniverse;
            System.out.println("Smallest number of planets is " + smallest);
        }
}
//output
//        Please enter how many planets are in our solar system: 8
//        Please enter how many planets do you think that are in our galaxy: 1000
//        Please enter how many planets do you think that are in the universe: 100000
//        Sum of all the planets is 101008
//        Average of all planets is 33669
//        Product of all planets is 800000000
//        Largest number of planets is 100000
//        Smallest number of planets is 8