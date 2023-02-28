package homeworkChapter_8;

//8.14 (Date Class) Create class Date with the following capabilities:
//a) Output the date in multiple formats, such as
//MM/DD/YYYY
//June 14, 1992
//DDD YYYY
//b) Use overloaded constructors to create Date objects initialized with dates of the formats
// In the first case the constructor should receive three integer values.
// In the second case it should receive a String and two integer values.
// In the third case it should receive two integer values, the first of which represents the day number in the year.
//[Hint: To convert the String representation of the month to a numeric value,
// compare Strings using the equals method.
// For example, if s1 and s2 are Strings, the method call s1.equals(s2) returns true
// if the Strings are identical and otherwise returns false.]


public class Exercise14Date {

    //three integer constants with different formats
    public final static int MM_DD_YYYY = 1;
    public final static int MONTH_DD_YYYY = 2;
    public final static int DDD_YYYY = 3;

    //integer array daysPerMonth that contains the number of days in each month
    private final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //String array months that contains the names of each month
    private final String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    //four instance variables
    private final int day;
    private final int year;
    private int month;
    private final int numberOfDaysPerYear;

    //three constructors that create a new date object
    public Exercise14Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
        numberOfDaysPerYear = calculateNumberOfDaysPerYear();
    }

    public Exercise14Date(String month, int day, int year) {
        for (int i = 1; i < months.length; i++) {
            if (months[i].equals(month))
                this.month = i;
        }

        this.day = day;
        this.year = year;
        numberOfDaysPerYear = calculateNumberOfDaysPerYear();
    }

    //takes the number of days in the year represented by this date and the year as input parameters
    //and initializes the corresponding instance variables.
    //it first sets the month to January and then calculates the month and day
    //based on the number of days in the year by calling the private method calculateNumberOfDaysPerYear()
    public Exercise14Date(int numberOfDaysPerYear, int year) {
        this.numberOfDaysPerYear = numberOfDaysPerYear;
        this.year = year;
        month = 1;

        for (int i = 1; i < daysPerMonth.length; i++) {
            if (numberOfDaysPerYear - daysPerMonth[i] > 0) {
                numberOfDaysPerYear -= daysPerMonth[i];
                month++;
            } else
                break;
        }

        day = numberOfDaysPerYear;
    }

    //takes a format constant as input and displays the date in the corresponding format using printf statements
    public void display(int format) {
        switch (format) {
            case MM_DD_YYYY:
                System.out.printf("%02d/%02d/%d%n", month, day, year);
                break;
            case MONTH_DD_YYYY:
                System.out.printf("%s %02d, %d%n", months[month], day, year);
                break;
            case DDD_YYYY:
                System.out.printf("%03d %d%n", numberOfDaysPerYear, year);
                break;
            default:
                break;
        }
    }

    //calculates the number of days in the year represented by this date by calling the days in the months up to the current month
    private int calculateNumberOfDaysPerYear() {
        int numberOfDaysPerYear = day;

        for (int i = 1; i < daysPerMonth.length; i++) {
            if (i < month)
                numberOfDaysPerYear += daysPerMonth[i];
            else
                break;
        }
        return numberOfDaysPerYear;
    }
}


