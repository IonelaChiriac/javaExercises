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

           int  accountNumber, // account number
                beginingBalance, //starting balance
                totalCharges, // total charges
                totalCredits, // total credits
                creditLimit; // allowed credit limit
               // newBalance; // new balance

//scanner object for user input
        Scanner keyboard = new Scanner(System.in);

//input account number
        System.out.print("Please enter customer's account number: ");
        accountNumber = keyboard.nextInt();
//input balance
        System.out.print("Please enter customer's beginning balance: ");
        beginingBalance = keyboard.nextInt();
//input charges
        System.out.print("Please enter total of all items charged by customer this month: ");
        totalCharges = keyboard.nextInt();
//input credits
        System.out.print("Please enter total of all credits applied to the customer’s account this month: ");
        totalCredits = keyboard.nextInt();

        System.out.print("Please enter credit limit applicable to customer: ");
        creditLimit = keyboard.nextInt();

        int newBalance = beginingBalance + totalCharges - totalCredits;
        System.out.printf("The customer's new balance is %d\n", newBalance); //print new balance

        if(newBalance > creditLimit)
            System.out.println("Credit Limit Exceeded!\n");
     }
}

//output
//Please enter customer's account number: 123
//Please enter customer's beginning balance: 1000
//Please enter total of all items charged by customer this month: 50
//Please enter total of all credits applied to the customer’s account this month: 20
//Please enter credit limit applicable to customer: 2000
//The customer's new balance is 1030

//Please enter customer's account number: 123
//Please enter customer's beginning balance: 1000
//Please enter total of all items charged by customer this month: 50
//Please enter total of all credits applied to the customer’s account this month: 20
//Please enter credit limit applicable to customer: 1000
//The customer's new balance is 1030
//Credit Limit Exceeded!