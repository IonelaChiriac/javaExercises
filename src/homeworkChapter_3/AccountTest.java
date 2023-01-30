package homeworkChapter_3;

// 3.11  (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw that withdraws money from an Account.
// Ensure that the withdrawal amount does not exceed the Account’s balance.
// If it does, the balance should be left unchanged and the method should print
// a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
// (Fig. 3.9) to test method withdraw.

import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        // Scanner that obtains input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Please enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Please enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        account1.whithdraw(withdrawalAmount);

        System.out.print("Please enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        account2.whithdraw(withdrawalAmount);

        // display balances
        System.out.printf("%n%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
}

//output
//        Jane Green balance: $50.00
//        John Blue balance: $0.00
//
//        Enter deposit amount for account1: 30
//
//        adding 30.00 to account1 balance
//
//        Jane Green balance: $80.00
//        John Blue balance: $0.00
//
//        Enter deposit amount for account2: 20
//
//        adding 20.00 to account2 balance
//
//        Jane Green balance: $80.00
//        John Blue balance: $20.00
//
//        Enter withdrawal amount for account1: 20
//        Enter withdrawal amount for account2: 10
//
//        Jane Green balance: $60.00
//        John Blue balance: $10.00