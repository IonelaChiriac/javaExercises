package homeworkChapter_2;

import java.util.Scanner;

//2.15 (Arithmetic) Write an application that asks the user to enter two integers,
//obtains them from the user and prints their sum, product, difference and quotient (division).
//Use the techniques shown in Fig. 2.7.
public class Exercise15Arithmetic {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        int greenApples; // first number to add
        int redApples; // second number to add
        int sum;
        int product;
        int division;
        int substraction;


        System.out.print("Please enter how many green apples you picked from the garden: "); // prompt
        greenApples = input.nextInt(); // read first number from user


        System.out.print("Please enter how many red apples you picked from the garden: "); // prompt
        redApples = input.nextInt(); // read second number from user


        sum = greenApples + redApples; //sum
        product = greenApples * redApples; //product
        division = sum / 2; //division
        substraction = sum - greenApples;//substraction
        System.out.printf("Well done!\nYou picked from the garden " +
                greenApples + " green apples and " +
                redApples + " red apples.\nNow you have a total of " +
                sum + " yummy apples!\n" + "If you will offer to your friend half, then you will remain with " +
                division + " apples.\n" + "If you will substract the green one's which are " +
                greenApples + ", then you will remain with " +
                substraction + " red apples%nThe product is " +
                product);
        // display each number introduced, then display the sum, then division

    }
}
//output
//        Please enter how many green apples you picked from the garden: 15
//        Please enter how many red apples you picked from the garden: 3
//        Well done!
//        You picked from the garden 15 green apples and 3 red apples.
//        Now you have a total of 18 yummy apples!
//        If you will offer to your friend half, then you will remain with 9 apples.
//        If you will substract the green one's which are 15, then you will remain with 3 red apples
//        The product is 45