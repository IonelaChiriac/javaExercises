package homeworkChapter_5;

//5.12 (Calculating the Product of Odd Integers)
// Write an application that calculates the product
//of the odd integers from 1 to 15.
public class Exercise12ProductOfOddIntegers {

    public static void main(String[] args) {
        int product = 1;

        //declare product and initialize to 1
        //count from 1 to 15
        //multiply product by 1
        for (int i = 1; i <= 15; i += 2)
            product *= i;

        System.out.println("The product of odd integers between 1 & 15 is: " + product);
    }
}

//output
//The product of odd integers between 1 & 15 is: 2027025