package homeworkChapter_5;
//5.13 (Factorials)
// Factorials are used frequently in probability problems.
// The factorial of a positive integer n (written n! and pronounced “n factorial”)
// is equal to the product of the positive integers from 1 to n.
// Write an application that calculates the factorials of 1 through 20.
// Use type long.
// Display the results in tabular format.
// What difficulty might prevent you from calculating the factorial of 100?

public class Exercise13Factorials {

    public static void main(String[] args) {
        //declare fact
        long factorial;

        //output table heading
        System.out.println("Number\t\t Factorial ");
        System.out.println("-----------------------------");

        //count 1 to 20
        for (int i = 1; i <= 20; i++) {
            //initialize factorial to 1
            factorial = 1;
            for (int j = 1; j <= i; j++)
                //multiply factorial to j
                factorial = factorial * j;
            //output
            System.out.println(i + "\t\t\t " + factorial);
        }
        System.exit(0);
    }
}


//output
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