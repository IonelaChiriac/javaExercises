package homeworkChapter_3;

//3.17 (Computerization of Health Records)
//        A health-care issue that has been in the news lately is the computerization of health records.
//        This possibility is being approached cautiously because of sensitive privacy and security concerns, among others.  [We address such concerns in later exercises.]
//        Computerizing health records could make it easier for patients to share their health profiles and histories among their various health-care professionals.
//        This could improve the quality of health care, help avoid drug conflicts and erroneous drug prescriptions,
//        reduce costs and, in emergencies, could save lives.
//        In this exercise, you’ll design a “starter” HealthProfile class for a person.
//        The class attributes should include the person’s first name, last name, gender, date of birth
//        (consisting of separate 100 Chapter 3 Introduction to Classes, Objects, Methods and Strings
//        attributes for the month, day and year of birth), height (in inches) and weight (in pounds).
//        Your class should have a constructor that receives this data.
//        For each attribute, provide set and get methods.
//        The class also should include methods that calculate and return the user’s age in years,
//        maximum heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see Exercise 2.33).
//        Write a Java app that prompts for the person’s information, instantiates an object of class HealthProfile
//        for that person and prints the information from that object—including
//        the person’s first name, last name, gender, date of birth, height and weight—then
//        calculates and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range.
//        It should also display the BMI values chart from Exercise 2.33.

import java.util.Calendar;

import java.util.Random;

import java.util.GregorianCalendar;

public class Exercise17HealthProfile {
    //constant value
    final int CONVERSION_FACTOR = 703;

    //instance variables of the HeatRates
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    //Double variables to read weight and height
    int weight_in_pounds;
    int height_in_inches;

    //parameterized constructor that sets the first name,last name and day,month ,year and heightand weight
    public Exercise17HealthProfile(String firstName, String lastName, int day, int month, int year, int height_in_inches, int weight_in_pounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height_in_inches = height_in_inches;
        this.weight_in_pounds = weight_in_pounds;
    }

    //methods to set the height and weight
    public void setHeight(int height_in_inches) {
        this.height_in_inches = height_in_inches;
    }

    public void setWeight(int weight_in_pounds) {
        this.weight_in_pounds = weight_in_pounds;
    }

    public int getHeight() {
        return height_in_inches;
    }

    public int getWeight() {
        return weight_in_pounds;
    }

    //methods that sets the first name and last name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //method setDate setMonth setYear getDate
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    //method getMonth returns the month value.
    public int getMonth() {
        return month;
    }

    //method getYear that returns the year value.
    public int getYear() {
        return year;
    }

    //method getFirstName returns the first name
    public String getFirstName() {
        return firstName;
    }

    //method getLastName returns the last name
    public String getLastName() {
        return lastName;
    }

    //returns the age of the person
    public int getAge() {
    //Create an instance of Calendar class with year, month and day values.
        Calendar dateOfBirth = new GregorianCalendar(year, month, day);

    //Calendar instantiates the current date .
        Calendar currentDate = new GregorianCalendar();

    //Get differnce between current
        int currentAge = currentDate.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

    //returns the current age of person
        return currentAge;
    }

    //calculates the maximum heart rate. the maximum heart rate is calculated by Maximum Heart rate=220- current age of person
    public int maximumHeartRate() {
        return 220 - getAge();
    }

    //calculates the target heart rate of a person in a range of 50- 85% of maximum heart rate.
    public int targetHeartRate() {
        Random random = new Random();
        int minimum = 50;

    //there are 36 numbers from 50 to 85.
    //create a random number 1 to 35
    //add the minimum value to get a random
    //number from 50 to 85
        int randomNum = random.nextInt(36) + minimum;

    //return a target heart rate on maximumheart //rate.

        return maximumHeartRate() * randomNum / 100;

    }

    //the method getBMI returns the body mass index of a person.
    public double getBMI() {
        //calculate the body mass index using BMI formula for weight in pounds and height in inches. */
        double bodyMassIndex = (double) (weight_in_pounds * CONVERSION_FACTOR) / (height_in_inches * height_in_inches);
        return bodyMassIndex;

    }
}
