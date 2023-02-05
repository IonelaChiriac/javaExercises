package homeworkChapter_4;

//4.18 (Credit Limit Calculator)
// Develop a Java application that determines whether any of several department-store customers
// has exceeded the credit limit on a charge account.
// For each customer, the following facts are available:
//a) account number
//b) balance at the beginning of the month
//c) total of all items charged by the customer this month
//d) total of all credits applied to the customer’s account this month
//e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance
//(= beginning balance + charges – credits),
// display the new balance and determine whether the new balance exceeds the customer’s credit limit.
// For those customers whose credit limit is exceeded,
// the program should display the message "Credit limit exceeded".

import java.util.Scanner;

public class Exercise18CreditCalculator {
    //Credit Limit Calculator
    public static void main(String[] args) {
        String creditStatusString;
        int account, // account number
                oldBalance, // starting balance
                charges, // total charges
                credits, // total credits
                creditLimit, // allowed credit limit
                newBalance; // new balance

//scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
//input account number
        System.out.print("Please enter Account Number: ");
        account = keyboard.nextInt();
//input balance
        System.out.print("Please enter Balance: ");
        oldBalance = keyboard.nextInt();
//input charges
        System.out.print("Please enter Charges: ");
        charges = keyboard.nextInt();
//input credits
        System.out.print("Please enter Credits: ");
        credits = keyboard.nextInt();

        System.out.print("Please enter Credit Limit: ");
        creditLimit = keyboard.nextInt();

        newBalance = oldBalance + charges - credits;

        if (newBalance > creditLimit)
            creditStatusString = "Credit limit exceeded";
        else
            creditStatusString = "Credit Report";
//output data
        System.out.println("New balance is " + newBalance);
        System.out.print(creditStatusString);
    }
}

//output
//        Please enter Account Number: 123
//        Please enter Balance: 1000
//        Please enter Charges: 50
//        Please enter Credits: 20
//        Please enter Credit Limit: 2000
//        New balance is 1030
//        Credit Report

//        Please enter Account Number: 123
//        Please enter Balance: 1000
//        Please enter Charges: 50
//        Please enter Credits: 20
//        Please enter Credit Limit: 1000
//        New balance is 1030
//        Credit limit exceeded