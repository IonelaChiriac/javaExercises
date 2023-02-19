package homeworkChapter_6;


//6.22 (Temperature Conversions)
// Implement the following integer methods:
//a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature,
// using the calculation
//celsius = 5.0 / 9.0 * (fahrenheit - 32);
//b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature,
//using the calculation
//fahrenheit = 9.0 / 5.0 * celsius + 32;
//c) Use the methods from parts (a) and (b) to write an application that enables the user either to enter a Fahrenheit temperature
// and display the Celsius equivalent or to enter
//a Celsius temperature and display the Fahrenheit equivalent.


import java.util.Scanner;

public class Exercise22TemperatureConversions {

    public static void main(String[] args) {

        int choice;
        int temperature;
        //input	from user
        Scanner input = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit ");

        //inputting number
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();

        //input	temperature
        System.out.println("Please enter temperature : ");
        temperature = input.nextInt();

        if (choice == 1)
            System.out.println(temperature + " in  Celsius is: " + celsius(temperature));

        else if (choice == 2)
            System.out.println(temperature + " in fahrenheit is: " + fahrenheit(temperature));
        else
            System.out.println("Invalid choice!");

        System.exit(0);
    }

    public static int celsius(int fahrenheitTemperature) {
        return ((int) (5.0 / 9.0 * (fahrenheitTemperature - 32)));
    }

    public static int fahrenheit(int celsiusTemperature) {
        return ((int) (9.0 / 5.0 * celsiusTemperature + 32));

    }
}


//output
//1. Fahrenheit to  Celsius
//2. Celsius to Fahrenheit
//Please enter your choice:
//2
//Please enter temperature :
//37
//37 in fahrenheit is: 98

//1. Fahrenheit to Celsius
//2. Celsius to Fahrenheit
//Please enter your choice:
//1
//Please enter temperature :
//100
//100 in  Celsius is: 37

//1. Fahrenheit to Celsius
//2. Celsius to Fahrenheit
//Please enter your choice:
//3
//Please enter temperature :
//100
//Invalid choice!

