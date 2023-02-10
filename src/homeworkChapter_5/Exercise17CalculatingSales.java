package homeworkChapter_5;

//5.17 (Calculating Sales)
// An online retailer sells five products whose retail prices are as follows:
//Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
//Write an application that reads a series of pairs of numbers as follows:
//a) product number
//b) quantity sold
//Your program should use a switch statement to determine the retail price for each product.
//It should calculate and display the total retail value of all products sold.
// Use a sentinel-controlled loop to determine when the program should stop looping and display the final results.

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exercise17CalculatingSales {
    public static void main(String[] args) {
        float product1 = 0,
                product2 = 0,
                product3 = 0,
                product4 = 0,
                product5 = 0;

        String inputString;
        int productId = 1;
        //Scanner object
        Scanner input = new Scanner(System.in);
        //ask user for product number until flag value entered
        while (productId != 0) {
            System.out.print("Please enter product number (1-5) (0 to stop): ");

            //determine the product chosen
            productId = input.nextInt();

            if (productId >= 1 && productId <= 5) {
                //determine the number sold of the item
                System.out.print("Please enter quantity sold: ");
                int quantity = input.nextInt();
                // increment the total for the item by the price times the quantity sold
                switch (productId) {
                    case 1:
                        product1 += quantity * 2.98;
                        break;
                    case 2:
                        product2 += quantity * 4.50;
                        break;
                    case 3:
                        product3 += quantity * 9.98;
                        break;
                    case 4:
                        product4 += quantity * 4.49;
                        break;
                    case 5:
                        product5 += quantity * 6.87;
                        break;
                }
            } else if (productId != 0) {
                System.out.println("Product number must be between 1 and 5 or 0 to stop\n");
            }
        }
        //decimal format to format floating point numbers with two digits to the right of the decimal point
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        //summary message
        String output = "Product 1: " + moneyFormat.format(product1);
        output += "\nProduct 2: "
                + moneyFormat.format(product2);
        output += "\nProduct 3: "
                + moneyFormat.format(product3);
        output += "\nProduct 4: "
                + moneyFormat.format(product4);
        output += "\nProduct 5: "
                + moneyFormat.format(product5) + "\n";

        System.out.println(output);
        System.exit(0);
    }
}

//output
//Please enter product number (1-5) (0 to stop): 1
//Please enter quantity sold: 3
//Please enter product number (1-5) (0 to stop): 2
//Please enter quantity sold: 1
//Please enter product number (1-5) (0 to stop): 3
//Please enter quantity sold: 5
//Please enter product number (1-5) (0 to stop): 4
//Please enter quantity sold: 10
//Please enter product number (1-5) (0 to stop): 5
//Please enter quantity sold: 7
//Please enter product number (1-5) (0 to stop): 6
//Product number must be between 1 and 5 or 0 to stop
//Please enter product number (1-5) (0 to stop): 0
//Product 1: $8.94
//Product 2: $4.50
//Product 3: $49.90
//Product 4: $44.90
//Product 5: $48.09
