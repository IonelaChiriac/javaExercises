package homeworkChapter_3;
//3.16 (Target-Heart-Rate Calculator)
//        While exercising, you can use a heart-rate monitor to see that
//        your heart rate stays within a safe range suggested by your trainers and doctors.
//        According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736),
//        the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
//        Your target heart rate is a range that’s 50–85% of your maximum heart rate.
//        [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health,
//        fitness and gender of the individual. Always consult a physician or qualified health-care professional before
//        beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
//        should include the person’s first name, last name and date of birth (consisting of separate attributes for
//        the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that
//        calculates and returns the person’s age (in years), a method that calculates and returns the person’s
//        maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
//        Java app that prompts for the person’s information, instantiates an object of class HeartRates and
//        prints the information from that object—including the person’s first name, last name and date of
//        birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
//        range.

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;

public class Exercise16HeartRates {
    //instance variables of the HeatRates
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    //Parameterized constructor that sets the first name,last name and day,month and year.
    public Exercise16HeartRates(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Method that sets the first name last name setDate setMonth setYear
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //method getDate getMonth getYear getFirstName getLastName
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //returns the age of the person
    public int getAge() {
    //create an instance of Calendar class with year,month and day values
        Calendar dateOfBirth = new GregorianCalendar(year, month, day);

    //calendar instantiates the current date .
        Calendar currentDate = new GregorianCalendar();

    //get difference between current and date of birth
        int currentAge = currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

    //returns the current age of person
        return currentAge;
    }

    //calculates the maximum heart rate.
    //maximum heart rate is calculated by
    //Maximum Heart rate=220- current age of person.
    public int maximumHeartRate() {
        return 220 - getAge();
    }

    //calculates the target heart rate of a person
    //in a range of 50- 85% of maximum heart rate
    public int targetHeartRate() {
        Random random = new Random();
        int minimum = 50;
    // there are 36 numbers from 50 to 85.
    //create a random number 1 to 35
    //add the minimum value to get a random number from 50 to 85
        int randomNum = random.nextInt(36) + minimum;

    //return a target heart rate on maximumheart rate.
        return maximumHeartRate() * randomNum / 100;

    }
}
