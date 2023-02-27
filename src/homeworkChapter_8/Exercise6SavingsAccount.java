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


import java.text.NumberFormat;

public class Exercise6SavingsAccount {

    //store the annual interest rate for all account holders
    private static double annualInterestRate;
    //indicate the amount of money the saver has on deposit
    private double savingsBalance;
    //constructor of the SavingsAccount class which initializes the savingsBalance instance variable with the value passed to it
    public Exercise6SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    //calculates the monthly interest by multiplying the savingsBalance by the annualInterestRate divided by 12, adding 1, and assigning the result back to the savingsBalance instance variable
    public void calculateMonthlyInterest() {
        savingsBalance = savingsBalance * (annualInterestRate / 12 / 100 + 1);
    }

    //modifies the value of the annualInterestRate variable, ensuring it is not negative
    public static void modifyInterestRate(double newAnnualInterestRate) {
        if (newAnnualInterestRate >= 0)
            annualInterestRate = newAnnualInterestRate;
        else
            annualInterestRate = 0;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    //overrides the default toString() method and returns a formatted string representing the savingsBalance instance variable
    @Override
    public String toString() {
        return String.format("%s", NumberFormat.getCurrencyInstance().format(getSavingsBalance()));
    }
}

