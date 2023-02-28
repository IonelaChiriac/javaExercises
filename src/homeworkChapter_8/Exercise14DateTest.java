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

public class Exercise14DateTest {

    public static void main(String[] args) {
        Exercise14Date date = new Exercise14Date("March", 27, 2000);
        //calls the display(int format) method of the object to display the date in MM_DD_YYYY, MONTH_DD_YYYY, and DDD_YYYY formats
        date.display(Exercise14Date.MM_DD_YYYY);
        date.display(Exercise14Date.MONTH_DD_YYYY);
        date.display(Exercise14Date.DDD_YYYY);
    }
}

//output
//03/27/2000
//March 27, 2000
//086 2000