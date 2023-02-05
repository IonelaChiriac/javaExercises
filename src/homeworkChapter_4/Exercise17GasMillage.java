package homeworkChapter_4;

//4.17 (Gas Mileage)
// Drivers are concerned with the mileage their automobiles get.
// One driver has kept track of several trips by recording the miles driven and gallons used for each tankful.
// Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print
//the combined miles per gallon obtained for all trips up to this point.
//All averaging calculations should produce floating-point results.
//Use class Scanner and sentinel-controlled repetition to obtain the data from the user.

import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercise17GasMillage {

    // start main method
    public static void main(String[] args) {
    // Declare and initialize
        int miles = 0, total_miles = 0;
        double gallons, total_gallons = 0.0;

    // create a Scanner object for keyboard input.
        Scanner obj = new Scanner(System.in);

    // create decimal format object
        DecimalFormat formatter = new DecimalFormat("00.000");

    // repeated loop until miles equal to -1
        while (miles != -1) {

    // prompt user for data
            System.out.println("Please enter the miles " + "used(-1 to quit) : ");

    // read data from user
            miles = obj.nextInt();
    // check for valid miles
            if (miles != -1) {

    // Prompt and read the user data
                System.out.println("Please enter gallons: ");
                gallons = obj.nextDouble();

    // calculate and display Miles per gallons
                total_miles = total_miles + miles;
                total_gallons = total_gallons + gallons;

                System.out.println("MilePerGallon(MPG) " + "this tankful = " + formatter.format(miles / gallons));
                System.out.println("Total MPG : " + formatter.format(total_miles / total_gallons));
            }
        }
        System.out.println("Total miles : " + total_miles);
        System.exit(0);
    }
}

//output
//        Please enter the miles used(-1 to quit) :
//        200
//        Please enter gallons:
//        10
//        MilePerGallon(MPG) this tankful = 20.000
//        Total MPG : 20.000
//        Enter the miles used(-1 to quit) :
//        450
//        Enter gallons:
//        10
//        MilePerGallon(MPG) this tankful = 45.000
//        Total MPG : 32.500
//        Enter the miles used(-1 to quit) :
//        550
//        Enter gallons:
//        20
//        MilePerGallon(MPG) this tankful = 27.500
//        Total MPG : 30.000
//        Enter the miles used(-1 to quit) :
//        320
//        Enter gallons:
//        30
//        MilePerGallon(MPG) this tankful = 10.667
//        Total MPG : 21.714
//        Enter the miles used(-1 to quit) :
//        750
//        Enter gallons:
//        40
//        MilePerGallon(MPG) this tankful = 18.750
//        Total MPG : 20.636
//        Enter the miles used(-1 to quit) :
//        -1
//        Total miles : 2270
