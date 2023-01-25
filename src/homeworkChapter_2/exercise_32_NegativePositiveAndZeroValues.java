package homeworkChapter_2;
import java.util.Scanner;

//(Negative, Positive and Zero Values)
// Write a program that inputs five numbers
// and determines and prints the number of negative numbers input,
// the number of positive numbers input and
//the number of zeros input.

public class exercise_32_NegativePositiveAndZeroValues {


    // main method begins execution of Java application
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = input.nextInt();
        System.out.println("Please enter the third number");
        int thirdNumber = input.nextInt();
        System.out.println("Please enter the fourth number");
        int fourthNumber = input.nextInt();
        System.out.println("Please enter the fifth number");
        int fifthNumber = input.nextInt();
        int negativeCounter = 0;
        int positiveCounter = 0;
        int zeroCounter = 0;

        if(firstNumber < 0) negativeCounter += 1;
        if(secondNumber < 0) negativeCounter += 1;
        if(thirdNumber < 0) negativeCounter += 1;
        if(fourthNumber < 0) negativeCounter += 1;
        if(fifthNumber < 0) negativeCounter += 1;

        if(firstNumber == 0) zeroCounter += 1;
        if(secondNumber == 0) zeroCounter += 1;
        if(thirdNumber == 0) zeroCounter += 1;
        if(fourthNumber == 0) zeroCounter += 1;
        if(fifthNumber == 0) zeroCounter += 1;

        if(firstNumber > 0) positiveCounter += 1;
        if(secondNumber > 0) positiveCounter += 1;
        if(thirdNumber > 0) positiveCounter += 1;
        if(fourthNumber > 0) positiveCounter += 1;
        if(fifthNumber > 0) positiveCounter += 1;

        System.out.println("The number of negative numbers input are " + negativeCounter);
        System.out.println("The number of zeros input are " + zeroCounter);
        System.out.println("The number of positive numbers input are " + positiveCounter);
    }
}