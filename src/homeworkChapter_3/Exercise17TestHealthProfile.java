package homeworkChapter_3;

import java.util.Scanner;

public class Exercise17TestHealthProfile {
    public static void main(String[] args) {

//Create a Scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name : ");

//Read first name
        String firstName = scanner.nextLine();
        System.out.println("Enter Last name : ");

//Read lat name
        String lastName = scanner.nextLine();
        System.out.println("Enter day of Birth Date : ");

//Read day value
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter month of Birth Date: ");

//Read month value
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter year of Birth Date : ");

//Read year value
        int year = Integer.parseInt(scanner.nextLine());

//reading eight and height of the person
        System.out.println("Enter Weight [in Pounds]: ");
        int weightPounds = scanner.nextInt();

        System.out.println("Enter Height [in inches]:");
        int heightInches = scanner.nextInt();
//Create an instance of HealthProfile with first name, last name,day,month,year,height and weight
        Exercise17HealthProfile patientHealthProfile = new Exercise17HealthProfile(firstName, lastName, day, month, year, heightInches, weightPounds);

//Print name of Person
        System.out.println("Name : " + patientHealthProfile.getFirstName().concat(" " + patientHealthProfile.getLastName()));

//Call getAge to print the age of person
        System.out.println("Age : " + patientHealthProfile.getAge());

// Call maximumHeartRate that prints maximum heart rate of person.
        System.out.println("Maximum heart rate :" + patientHealthProfile.maximumHeartRate());

//Call targetHeartRate that prints target heart rate of person.
        System.out.println("Target heart rate :" + patientHealthProfile.targetHeartRate());

//Call the method getBMI method that returns the body mass index of a person.
        double BMI = patientHealthProfile.getBMI();
        System.out.println("Body Mass Index : " + BMI);

//Checking if BMI is less than 18.5 Then print //Underweight.
        if (BMI < 18.5)
            System.out.println("Underweight");

//Checking if BMI is greater than or equal to 18.5 and less than or equal to 24.9. Then print Normal
        else if (BMI >= 18.5 && BMI <= 24.9)
            System.out.println("Normal");
 //Checking if BMI is greater than or equal to 25 and less than or equal to 29.9 . Then print Overweight. */
        else if (BMI >= 25 && BMI <= 29.9)
            System.out.println("Overweight");
//Otherwise the BMI is greater than or equal to 30 print Obese.
        else
        System.out.println("Obese");
        System.out.println("BMI-Chart");
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal : between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");
    }
}

//output
//Enter first name :
//Jane
//Enter Last name :
//Green
//Enter day of Birth Date :
//06
//Enter month of Birth Date:
//10
//Enter year of Birth Date :
//1990
//Enter Weight [in Pounds]:
//116
//Enter Height [in inches]:
//63
//Name : Jane Green
//Age : 33
//Maximum heart rate :187
//Target heart rate :143
//Body Mass Index : 20.54623330813807
//Normal
//BMI-Chart
//BMI VALUES
//Underweight: less than 18.5
//Normal : between 18.5 and 24.9
//Overweight: between 25 and 29.9
//Obese: 30 or greater