package homeworkChapter_8;

public class Exercise8DateTest {

    public static void main(String args[]) {
        Exercise8Date day1 = new Exercise8Date(4, 30, 1999); // Test going into a new month
        Exercise8Date day2 = new Exercise8Date(12, 31, 1999); // Test going into a new year
        Exercise8Date day3 = new Exercise8Date(2, 28, 2004); // Test for leap year

        //increment days by one
        day1.nextDay();
        day2.nextDay();
        day3.nextDay();

        //shows new values for date objects
        System.out.printf("%nDates incremented by 1: %n");
        System.out.printf("Date 1: %s%nDate 2: %s%nDate 3: %s%n", day1, day2, day3);
    }
}

//output
//Date object constructor for date 4/30/1999
//Date object constructor for date 12/31/1999
//Date object constructor for date 2/28/2004
//
//Dates incremented by 1:
//Date 1: 5/1/1999
//Date 2: 1/1/2000
//Date 3: 2/29/2004