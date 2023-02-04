package homeworkChapter_3;

import java.util.Scanner;

public class Exercise16HeartRateTest {
    public static void main(String[] args) {

    //scanner class object
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your first name : ");
    //read first name
        String fname = reader.nextLine();
        System.out.println("Please enter your last name : ");

    //read lat name
        String lname = reader.nextLine();
        System.out.println("Please enter your day of birth date : ");

    //read day value
        int day = Integer.parseInt(reader.nextLine());
        System.out.println("Please enter your month of birth date: ");

    //read month value
        int month = Integer.parseInt(reader.nextLine());
        System.out.println("Please enter your year of Birth Date : ");

    //Read year value
        int year = Integer.parseInt(reader.nextLine());

    //create an instance of HeartRates with first name,last name, day, month and year values
        Exercise16HeartRates heartRate = new Exercise16HeartRates(fname, lname, day, month, year);

    //print name of Person
        System.out.println("Name : " + heartRate.getFirstName().concat(" " + heartRate.getLastName()));

    //call getAge to print the age of person
        System.out.println("Age : " + heartRate.getAge());

    //call maximumHeartRate that prints maximum heart rate of person
        System.out.println("Maximum heart rate :" + heartRate.maximumHeartRate());

    //call targetHeartRate that prints target heart rate of person
        System.out.println("Target heart rate :" + heartRate.targetHeartRate());
    }
}

//output
//        Please enter your first name :
//        Jane
//        Please enter your last name :
//        Green
//        Please enter your day of birth date :
//        6
//        Please enter your month of birth date:
//        10
//        Please enter your year of Birth Date :
//        1990
//        Name : Jane Green
//        Age : 33
//        Maximum heart rate :187
//        Target heart rate :142