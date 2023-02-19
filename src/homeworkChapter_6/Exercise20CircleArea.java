package homeworkChapter_6;

//6.20 (Circle Area)
// Write an application that prompts the user for the radius of a circle
// and uses a method called circleArea to calculate the area of the circle.


import java.util.Scanner;

public class Exercise20CircleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the radius of a circle: ");
        double radius = scanner.nextDouble();

        //call the circleArea() method with the radius as an argument and print the result
        System.out.printf("Circle area is %,.2f cm²", circleArea(radius));
        scanner.close();
    }

    //calculate the area of a circle with the given radius using the formula: (pi times radius squared)
    //returns the result as a double value
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

//output
//Please enter the radius of a circle: 5.8
//Circle area is 105.68 cm²