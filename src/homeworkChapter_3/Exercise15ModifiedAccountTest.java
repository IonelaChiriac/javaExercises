package homeworkChapter_3;

import java.util.Scanner;

public class Exercise15ModifiedAccountTest {

    public static void main(String[] args) {
        Exercise15ModifiedAccount exercise15ModifiedAccount1 = new Exercise15ModifiedAccount("Jane Green", 50.00);
        Exercise15ModifiedAccount exercise15ModifiedAccount2 = new Exercise15ModifiedAccount("John Blue", -7.53);

        // display initial balance of each object
        displayAccount(exercise15ModifiedAccount1);
        displayAccount(exercise15ModifiedAccount2);
        System.out.println();

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("adding %.2f to account1 balance%n%n", depositAmount);
        exercise15ModifiedAccount1.deposit(depositAmount); // add to account1's balance

        // display balances
        displayAccount(exercise15ModifiedAccount1);
        displayAccount(exercise15ModifiedAccount2);
        System.out.println();

        System.out.print("Please enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("adding %.2f to account2 balance%n%n", depositAmount);
        exercise15ModifiedAccount2.deposit(depositAmount); // add to account2 balance

        // display balances
        displayAccount(exercise15ModifiedAccount1);
        displayAccount(exercise15ModifiedAccount2);
    }
    public static void displayAccount(Exercise15ModifiedAccount exercise15ModifiedAccount) {
        System.out.printf("%s balance: $%.2f%n", exercise15ModifiedAccount.getName(), exercise15ModifiedAccount.getBalance());
    }
}

//output
//        Jane Green balance: $50.00
//        John Blue balance: $0.00
//
//        Please enter deposit amount for account1: 30
//        adding 30.00 to account1 balance
//
//        Jane Green balance: $80.00
//        John Blue balance: $0.00
//
//        Please enter deposit amount for account2: 20
//        adding 20.00 to account2 balance
//
//        Jane Green balance: $80.00
//        John Blue balance: $20.00