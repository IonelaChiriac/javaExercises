package homeworkChapter_3;

import java.util.*;

public class Exercise14DateTest {
    // main method
    public static void main(String[] args) {

        // input from the user
        Scanner input = new Scanner(System.in);
        // declare the variables
        int day, month, year;

        // Define the date object using parameterized constructor by setting day month year
        Exercise14Date exercise14Date1 = new Exercise14Date(3, 2, 2023);

        // display the date object by making a call to displayDate() method
        System.out.print("The starting date is: ");
        exercise14Date1.displayDate();

        // define another Date object to test other Date class methods
        Exercise14Date exercise14Date2 = new Exercise14Date();
        System.out.print("\nToday's date details" + ":\n");

        // prompt the user for the day and store the read value into variable day
        System.out.print("Please enter the current day (interval 1-31): ");
        day = input.nextInt();

        // prompt the user for the month and store the read value into variable month
        System.out.print("Please enter the current month in numbers" + " (interval 1-12): ");
        month = input.nextInt();

        // prompt the user for the year and store the
        // read value into variable year
        System.out.print("Please enter the current year " + "(eg. 2023): ");
        year = input.nextInt();
        System.out.print("\n");

        //set the above read values by using set methods of date class
        exercise14Date2.setMonth(month);
        exercise14Date2.setDay(day);
        exercise14Date2.setYear(year);

        //display the date in diff format by using the get methods
        System.out.print("Date(day/month/year) : ");
        exercise14Date2.displayDate();
    }
}

//output

//        The starting date is: 3/2/2023
//
//        Today's date details:
//        Please enter the current day (interval 1-31): 6
//        Please enter the current month in numbers (interval 1-12): 2
//        Please enter the current year (eg. 2023): 2023
//
//        Date(day/month/year) : 6/2/2023

//invalid day and month case (nr of days for each months is not covered)
//        The starting date is: 3/2/2023
//
//        Today's date details:
//        Please enter the current day (interval 1-31): 32
//        Please enter the current month in numbers (interval 1-12): 13
//        Please enter the current year (eg. 2023): 2023
//
//        Invalid month input
//        Invalid day input
//        Date(day/month/year) : 1/1/2023