package homeworkChapter_3;

//3.14 (Date Class)
//        Create a class called Date that includes three instance variables
//        a month (type int), a day (type int) and a year (type int).
//        Provide a constructor that initializes the three instance variables and assumes that the values provided are correct.
//        Provide a set and a get method for each instance variable.
//        Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
//        Write a test app named DateTest that demonstrates class Date’s capabilities.
public class Exercise14Date {
    // declare three instance variables
    private int month;
    private int day;
    private int year;

    // define the default constructor
    public Exercise14Date() {
        // set the instance variables to
        // default values
        this.month = 1;
        this.day = 1;
        this.year = 2023;
    }

    // declare constructor
    public Exercise14Date(int day, int month, int year) {
        // Initialization
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // begin Set method of month
    public void setMonth(int month) {
        if (month > 0 && month < 13)
            this.month = month;
        else
            System.out.println("Invalid month input");
    }

    // begin get method of month
    public int getMonth() {
        return this.month;
    }

    // begin set method of day
    public void setDay(int day) {
        if (day > 0 && day < 32)
            this.day = day;
        else
            System.out.println("Invalid day input");
    }

    //begin get method of a day
    public int getDay() {
        return this.day;
    }

    //begin get method of a year
    public void setYear(int year) {
        this.year = year;
    }//End setYear

    public int getYear() {
        return this.year;
    }//End getYear

    //display method
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }//end displayDate method
}