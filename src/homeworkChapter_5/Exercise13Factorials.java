package homeworkChapter_5;
//5.13 (Factorials)
// Factorials are used frequently in probability problems.
// The factorial of a positive integer n (written n! and pronounced “n factorial”)
// is equal to the product of the positive integers from 1 to n.
// Write an application that calculates the factorials of 1 through 20.
// Use type long.
// Display the results in tabular format.
// What difficulty might prevent you from calculating the factorial of 100?

import java.math.BigInteger;

//imported class BigInteger from java.math package
public class Exercise13Factorials {
    public static void main(String[] args) {

//case with BigInteger data type bigger then 21 --------------------------/
        //declare var factorial of type BigInteger
        BigInteger factorial;

        //output table heading
        System.out.println("Number\t\t Factorial ");
        System.out.println("-----------------------------");

        //count 1 to 21
        //initialize factorial to 1
        //initializes the factorial variable to the constant BigInteger.ONE, which represents the number 1
        for (int i = 1; i <= 21; i++) {
            factorial = BigInteger.ONE;

            //nested for loop that calculates the factorial of i
            //variable j counts from 1 to i,
            //each iteration of the loop multiplies factorial by j using the multiply method
            for (int j = 1; j <= i; j++)
                factorial = factorial.multiply(BigInteger.valueOf(j));
            //output the value of i and its corresponding factorial
            System.out.println(i + "\t\t\t " + factorial);
        }
        System.exit(0);
    }
}

//case with long data type max 20 --------------------------/

//        //declare fact
//        long factorial;
//
//        //output table heading
//        System.out.println("Number\t\t Factorial ");
//        System.out.println("-----------------------------");
//
//        //count 1 to 20
//        for (int i = 1; i <= 20; i++) {
//            //initialize factorial to 1
//            factorial = 1;
//            for (int j = 1; j <= i; j++)
//                //multiply factorial to j
//                factorial = factorial * j;
//            //output
//            System.out.println(i + "\t\t\t " + factorial);
//        }
//        System.exit(0);
//    }


//output 21
//Number		 Factorial
//-----------------------------
//1			     1
//2			     2
//3			     6
//4			     24
//5			     120
//6			     720
//7			     5040
//8			     40320
//9			     362880
//10			 3628800
//11			 39916800
//12			 479001600
//13			 6227020800
//14			 87178291200
//15			 1307674368000
//16			 20922789888000
//17			 355687428096000
//18			 6402373705728000
//19			 121645100408832000
//20			 2432902008176640000
//21			 51090942171709440000


//output 20
//Number		 Factorial
//-----------------------------
//1			     1
//2			     2
//3			     6
//4			     24
//5			     120
//6			     720
//7			     5040
//8			     40320
//9			     362880
//10			 3628800
//11			 39916800
//12			 479001600
//13			 6227020800
//14			 87178291200
//15			 1307674368000
//16			 20922789888000
//17			 355687428096000
//18			 6402373705728000
//19			 121645100408832000
//20			 2432902008176640000