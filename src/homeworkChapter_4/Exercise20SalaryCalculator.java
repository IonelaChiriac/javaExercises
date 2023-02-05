package homeworkChapter_4;

import java.util.Scanner; //for scanner class

//4.20 (Salary Calculator)
//Develop a Java application that determines the gross pay for each of three employees.
//The company pays straight time for the first 40 hours worked by each employee
//and time and a half for all hours worked in excess of 40.
// You’re given a list of the employees, their number of hours worked last week and their hourly rates.
// Your program should input this information for each employee,
// then determine and display the employee’s gross pay. Use class Scanner to input the data.
public class Exercise20SalaryCalculator {

    public static void main(String[] args) {
// declare and initialize
        double hours = 0;
        double rate = 0;
        double salary;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
// repeated loop until hours equal to -1
        while (hours != -1)
        {
//prompt user for data
            System.out.print("Please enter the hours worked (-1 to end): ");
            hours = keyboard.nextDouble ();
//read data from user
// check for valid hours worked
            if (hours != -1)
            {
//prompt for user data and read the data
                System.out.print("Please enter hourly rate of the worker : ");
                rate = keyboard.nextDouble();
            }
// calculation and output of salary
            salary = hours * rate;
            if (hours > 40)
                salary = salary + (hours - 40) * rate * 0.5;
            System.out.println("Salary is $" + salary);
            System.exit(0); //exit(0) : Generally used to indicate successful termination. terminate JVM
        }
        System.out.println();
    }
}

//output
//        Please enter the hours worked (-1 to end): 40
//        Please enter hourly rate of the worker : 450
//        Salary is $18000.0