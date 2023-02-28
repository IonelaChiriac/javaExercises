package homeworkChapter_8;

//8.7 (Enhancing Class Time2)
// Modify class Time2 of Fig. 8.5 to include a tick method that increments the time stored in a Time2 object by one second.
// Provide method incrementMinute to increment the minute by one and method incrementHour to increment the hour by one.
// Write a program that tests the tick method, the incrementMinute method and the incrementHour method to ensure that they work correctly.
// Be sure to test the following cases:
//a) incrementing into the next minute,
//b) incrementing into the next hour and
//c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).
public class Exercise7Time2Test {
    public static void main(String[] args) {

        Exercise7Time2 t1 = new Exercise7Time2(); // 00:00:00
        Exercise7Time2 t2 = new Exercise7Time2(23); // 23:00:00
        Exercise7Time2 t3 = new Exercise7Time2(23, 59); // 23:59:00
        Exercise7Time2 t4 = new Exercise7Time2(12, 25, 59); // 12:25:59


        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; iterates to next day", t2);
        displayTime("t3: hour and minute specified; loops to next hour", t3);
        displayTime("t4: hour, minute and second specified; loops to next minute", t4);

        t1.tick();
        t2.incrementHour();
        t3.incrementMinute();
        t4.tick();

        System.out.println("After increment");
        displayTime("t1: ", t1);
        displayTime("t2: ", t2);
        displayTime("t3: ", t3);
        displayTime("t4: ", t4);


        // attempt to initialize t6 with invalid values
        try {
            Exercise7Time2 t6 = new Exercise7Time2(27, 74, 99); // invalid values
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Exercise7Time2 t) {
        System.out.printf("%s%n  %s%n  %s%n",header, t.toUniversalString(), t.toString());
    }
}


//output
//Constructed with:
//t1: all default arguments
//  00:00:00
//  12:00:00 AM
//t2: hour specified; iterates to next day
//  23:00:00
//  11:00:00 PM
//t3: hour and minute specified; loops to next hour
//  23:59:00
//  11:59:00 PM
//t4: hour, minute and second specified; loops to next minute
//  12:25:59
//  12:25:59 PM
//After increment
//t1:
//  00:00:01
//  12:00:01 AM
//t2:
//  00:00:00
//  12:00:00 AM
//t3:
//  00:00:00
//  12:00:00 AM
//t4:
//  12:26:00
//  12:26:00 PM
//
//Exception while initializing t6: hour must be 0-23