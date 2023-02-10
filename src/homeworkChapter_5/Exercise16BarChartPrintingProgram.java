package homeworkChapter_5;

//5.16 (Bar Chart Printing Program)
// One interesting application of computers is to display graphs and bar charts.
// Write an application that reads five numbers between 1 and 30.
// For each number that’s read, your program should display the same number of adjacent asterisks.
// For example, if your program reads the number 7, it should display *******.
// Display the bars of asterisks after you read all five numbers.

import java.util.Scanner;

public class Exercise16BarChartPrintingProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        String[] bars = new String[5];

        for (int i = 0; i < bars.length; i++)
            bars[i] = "";

        for (int i = 0; i < numbers.length; ) {
            System.out.print("Please enter a number between 1 and 30: ");
            numbers[i] = input.nextInt();

            if (numbers[i] < 1 || numbers[i] > 30)
                System.out.println(" - Error: number must is between 1-30. Please try again!");
            else {
                for (int j = 0; j < numbers[i]; j++)
                    bars[i] += "*";
                i++;
            }
        }
        input.close();

        for (int i = 0; i < numbers.length; i++)
            System.out.printf("%02d = %s%n", numbers[i], bars[i]);
    }
}

//output

//Enter a number between 1 and 30: 2
//Enter a number between 1 and 30: 3
//Enter a number between 1 and 30: 4
//Enter a number between 1 and 30: 5
//Enter a number between 1 and 30: 6
//02 = **
//03 = ***
//04 = ****
//05 = *****
//06 = ******

//Please enter a number between 1 and 30: 0
// - Error: number must is between 1-30. Please try again!
