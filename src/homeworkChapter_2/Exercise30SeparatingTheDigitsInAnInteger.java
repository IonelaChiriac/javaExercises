package homeworkChapter_2;

import java.util.Scanner;

//Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
//separated from one another by three spaces each. For example, if the user types in the number 42339,
//the program should print 4  2  3  3  9
//Assume that the user enters the correct number of digits. What happens when you enter a
//number with more than five digits? What happens when you enter a number with fewer than five
//digits? [Hint: It’s possible to do this exercise with the techniques you learned in this chapter. You’ll
//need to use both division and remainder operations to “pick off” each digit.]
public class Exercise30SeparatingTheDigitsInAnInteger {

    // main method begins execution of Java application
    public static void main(String[] args)
    {
        // create Scanner to obtain input from command line
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a five-digit number");

        int numberInput = input.nextInt();

        if(numberInput >= 10000 && numberInput <= 99999){
            int firstDigit = numberInput / 10000;
            int secondDigit = numberInput / 1000 % 10;
            int thirdDigit = numberInput / 100 % 10;
            int fourthDigit = numberInput / 10 % 10;
            int fifthDigit = numberInput % 10;

            System.out.printf("%d   %d   %d   %d   %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
        } else {
            System.out.println("Incorrect number of digits entered!");
        }
    }
}
