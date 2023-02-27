package homeworkChapter_8;

//8.6 (Savings Account Class)
// Create class SavingsAccount.
// Use a static variable annualInterestRate to store the annual interest rate for all account holders.
// Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit.
// Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the
// savingsBalance by annualInterestRate divided by 12—this interest should be added to savingsBalance.
// Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
// Write a program to test class SavingsAccount.
// Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
// Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months
// and print the new balances for both savers.
// Next, set the annualInterestRate to 5%, calculate the next month’s interest
// and print the new balances for both savers
public class Exercise6SavingsAccountTest {

    public static void main(String[] args) {

        //two SavingsAccount objects, saver1 and saver2, with initial balances of $1000 and $3000
        Exercise6SavingsAccount saver1 = new Exercise6SavingsAccount(1000);
        Exercise6SavingsAccount saver2 = new Exercise6SavingsAccount(3000);

        //modifies the interest rate to 4% and then calculates monthly interest for both savers for a year by calling the calculateMonthlyInterest() method in a loop
        Exercise6SavingsAccount.modifyInterestRate(4);

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("saver1 %s%n", saver1);
        System.out.printf("saver2 %s%n", saver2);

        Exercise6SavingsAccount.modifyInterestRate(5);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("saver1 %s%n", saver1);
        System.out.printf("saver2 %s%n", saver2);
    }

}

