package homeworkChapter_8;

//8.5 (Modifying the Internal Data Representation of a Class)
// It would be perfectly reasonable for the Time2 class of Fig. 8.5 to represent the time
// internally as the number of seconds since midnight rather than the three integer values hour, minute and second.
// Clients could use the same public methods and get the same results.
// Modify the Time2 class of Fig. 8.5 to implement the time as the number of seconds
// since midnight and show that no change is visible to the clients of the class.
public class Exercise5Time2SecondsTest {

    public static void main(String[] args) {
        long seconds = 7651;


        Exercise5Time2Seconds t1 = new Exercise5Time2Seconds(); // 00:00:00
        Exercise5Time2Seconds t2 = new Exercise5Time2Seconds(2); // 02:00:00
        Exercise5Time2Seconds t3 = new Exercise5Time2Seconds(21, 34); // 21:34:00
        Exercise5Time2Seconds t4 = new Exercise5Time2Seconds(12, 25, 42); // 12:25:42
        Exercise5Time2Seconds t5 = new Exercise5Time2Seconds(t4); // 12:25:42
        Exercise5Time2Seconds t7 = new Exercise5Time2Seconds(seconds);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);
        displayTime("t7: seconds specified only", t7);

        // attempt to initialize t6 with invalid values
        try {
            Exercise5Time2Seconds t6 = new Exercise5Time2Seconds(27, 74, 99); // invalid values
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    } // end method main

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Exercise5Time2Seconds t) {
        System.out.printf("%s%n  %s%n  %s%n", header, t.toUniversalString(), t.toString());
    } // end method displayTime
} // end class Time2Test

//output
//Constructed with:
//t1: all default arguments
//  00:00:00
//  12:00:00 AM
//t2: hour specified; default minute and second
//  02:00:00
//  2:00:00 AM
//t3: hour and minute specified; default second
//  21:34:00
//  9:34:00 PM
//t4: hour, minute and second specified
//  12:25:42
//  12:25:42 PM
//t5: Time2 object t4 specified
//  12:25:42
//  12:25:42 PM
//t7: seconds specified only
//  02:07:31
//  2:07:31 AM
//
//Exception while initializing t6: hour must be 0-23



