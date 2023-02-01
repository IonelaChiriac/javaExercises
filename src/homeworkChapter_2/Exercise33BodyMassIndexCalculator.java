package homeworkChapter_2;

import java.util.Scanner;

//(Body Mass Index Calculator)
// We introduced the body mass index (BMI) calculator in Exercise 1.10.
//The formulas for calculating BMI are
//BMI = weightInPounds × 703 / (heightInInches * heightInInches)
//or
//BMI = weightInKilograms / heightInMeters * heightInMeters
//Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you prefer, the user’s weight in kilograms and height in meters),
// then calculates and displays the user’s body mass index.
// Also, display the following information from the Department of Health and
//Human Services/National Institutes of Health so the user can evaluate his/her BMI:
//BMI VALUES
//Underweight: less than 18.5
//Normal: between 18.5 and 24.9
//Overweight: between 25 and 29.9
//Obese: 30 or greater

public class Exercise33BodyMassIndexCalculator {


    // main method begins execution of Java application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightInKilograms;
        double heightInMeters;
        double bodyMassIndex;

        System.out.println("Please enter your weight in kilograms: ");
        weightInKilograms = input.nextDouble();

        System.out.println("Please enter your height in meters: ");
        heightInMeters = input.nextDouble();

        bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is " + bodyMassIndex);

        System.out.println("\n BMI Values \n Underweight: less than 18.5 \n Normal:    between 18.5 and 24.9 \n Overweight:  between 25 and 29.9 \n Obese:    30 or greater");


    }
}

//output
//        Please enter weight in kilograms:
//        53
//        Please enter height in meters:
//        1.58
//        Your BMI is 21.230572023714146
//
//        BMI Values
//        Underweight: less than 18.5
//        Normal:    between 18.5 and 24.9
//        Overweight:  between 25 and 29.9
//        Obese:    30 or greater