package homeworkChapter_4;

//4.19 (Sales Commission Calculator)
// A large company pays its salespeople on a commission basis.
//The salespeople receive $200 per week plus 9% of their gross sales for that week.
// For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a total of $650.
// You’ve been supplied with a list of the items sold by each salesperson.
// The values of these items are as follows:
//Item Value
//1 239.99
//2 129.75
//3 99.95
//4 350.89

import java.util.Scanner;

public class Exercise19SalesCommissionCalculator {

    public static void main(String[] args) {
        //declare variables
        //gross to hold the gross amount earned
        //earnings to hold the overall amount earned by the sales person
        //commission to hold the commission given to the sales person
        double gross = 0.0, earnings, commission = 0;

        //itemNumber to keep track of each item number
        //numberSold read the value of number items of the particular item sold last week
        int itemNumber = 0, numberSold;

        //totalItemSold to hold overall items sold by the sales person
        int totalItemsSold = 0;

        //scanner object to read data from the console
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the sales of the four"
                + " items sold by the sales "
                + "person for the last week"
                + "as prompted");

        //loop until itemNumber reached 4
        while (itemNumber < 4) {

            //increment the itemNumber(item number)
            itemNumber++;

            System.out.print("Enter number of item-"
                    + (itemNumber)
                    + " sold "
                    + "in last week: "); //prompt the user

            //read the int value from the console and store it in numberSold
            numberSold = keyboard.nextInt();

            //use if conditions so that depending the itemNumber (item) number the respective
            //item cost is calculated for the last week
            //if itemNumber is 1, then compute the cost of the item 1 sold for last week
            //depending on the number of item 1 sold
            if (itemNumber == 1) {
                gross += numberSold * 239.99;
                totalItemsSold += numberSold;
            }

            //if itemNumber is 2/ 3 / 4, then compute the cost of the item 2/ 3/ 4  sold for last week
            // depending on the number of item 2 sold
            else if (itemNumber == 2) {
                gross += numberSold * 129.75;
                totalItemsSold += numberSold;
            } else if (itemNumber == 3) {
                gross += numberSold * 99.95;
                totalItemsSold += numberSold;
            } else if (itemNumber == 4) {
                gross += numberSold * 350.89;
                totalItemsSold += numberSold;
            }
        }

        //display the information about the number of items sold by the sales person
        System.out.printf("\nThe sales person sold %d"
                + " items in last week\n", totalItemsSold);


        //display the information about the total sales done by the sales person
        System.out.printf("Overall sales done by the" + " sales person is: $%.2f\n", gross);


        //compute the commission of the sales person
        commission = (9.0 / 100) * gross;
        System.out.printf("\nCommission earned by the" + " sales person is: $%.2f\n", commission);


        //compute the net amount of the earnings of the salesperson
        earnings = 200.00 + commission;
        System.out.printf("Earnings of the sales person " + "in the last week is: $%.2f", earnings);
    }
}

//output
//Enter the sales of the four items sold by the sales person for the last weekas prompted
//Enter number of item-1 sold in last week: 10
//Enter number of item-2 sold in last week: 20
//Enter number of item-3 sold in last week: 30
//Enter number of item-4 sold in last week: 40
//
//The sales person sold 100 items in last week
//Overall sales done by the sales person is: $22029.00
//
//Commission earned by the sales person is: $1982.61
//Earnings of the sales person in the last week is: $2182.61
//Process finished with exit code 0



