package homeworkChapter_8;

//8.12 (Date and Time Class)
// Create class DateAndTime that combines the modified Time2 class of Exercise 8.7
// and the modified Date class of Exercise 8.8.
// Modify method incrementHour to call method nextDay if the time is incremented into the next day.
// Modify methods toString and toUniversalString to output the date in addition to the time.
// Write a program to test the new class DateAndTime.
// Specifically, test incrementing the time to the next day.

public class Exercise12DateAndTimeTest {
    public static void main(String args[]) {
        Exercise12DateAndTime day1 = new Exercise12DateAndTime(1, 1, 1, 1, 1, 2000);
        Exercise12DateAndTime day2 = new Exercise12DateAndTime(23, 59, 59, 12, 31, 2001);

        System.out.printf("Initial time and date:%n%s%n%s", day1, day2);

        day1.tick();
        day2.tick();

        System.out.printf("Time and date after increment of one second:%n%s%n%s", day1, day2);
    }
}


//output
//Initial time and date:
//1:01:01 AM
//1/1/2000
//
//11:59:59 PM
//12/31/2001
//Time and date after increment of one second:
//1:01:02 AM
//1/1/2000
//
//12:00:00 AM
//1/1/2002