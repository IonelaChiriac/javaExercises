package homeworkChapter_2;

//(Table of Squares and Cubes)
// write an application that calculates the squares and cubes of the numbers from 0 to 10 and
//prints the resulting values in table format.
/*
    number square cube
        0    0     0
        1    1     1
        2    4     8
        3    9     27
        4    16    64
        5    25    125
        6    36    216
        7    49    343
        8    64    512
        9    81    729
        10   100   1000
*/

public class Exercise31TableOfSquaresAndCubes {

    // main method begins execution of Java application
    public static void main(String[] args)
    {
        System.out.println("number   square   cube");
        int firstNumber = 0;
        System.out.printf("%d         %d       %d%n", firstNumber, firstNumber * firstNumber, firstNumber * firstNumber * firstNumber);
        int secondNumber = 1;
        System.out.printf("%d         %d       %d%n", secondNumber, secondNumber * secondNumber, secondNumber * secondNumber * secondNumber);
        int thirdNumber = 2;
        System.out.printf("%d         %d       %d%n", thirdNumber, thirdNumber * thirdNumber, thirdNumber * thirdNumber * thirdNumber);
        int fourthNumber = 3;
        System.out.printf("%d         %d       %d%n", fourthNumber, fourthNumber * fourthNumber, fourthNumber * fourthNumber * fourthNumber);
        int fifthNumber = 4;
        System.out.printf("%d         %d      %d%n", fifthNumber, fifthNumber * fifthNumber, fifthNumber * fifthNumber * fifthNumber);
        int sixthNumber = 5;
        System.out.printf("%d         %d      %d%n", sixthNumber, sixthNumber * sixthNumber, sixthNumber * sixthNumber * sixthNumber);
        int seventhNumber = 6;
        System.out.printf("%d         %d      %d%n", seventhNumber, seventhNumber * seventhNumber, seventhNumber * seventhNumber * seventhNumber);
        int eightNumber = 7;
        System.out.printf("%d         %d      %d%n", eightNumber, eightNumber * eightNumber, eightNumber * eightNumber * eightNumber);
        int ninthNumber = 8;
        System.out.printf("%d         %d      %d%n", ninthNumber, ninthNumber * ninthNumber, ninthNumber * ninthNumber * ninthNumber);
        int tenthNumber = 9;
        System.out.printf("%d         %d      %d%n", tenthNumber, tenthNumber * tenthNumber, tenthNumber * tenthNumber * tenthNumber);
        int eleventhNumber = 10;
        System.out.printf("%d        %d     %d%n", eleventhNumber, eleventhNumber * eleventhNumber, eleventhNumber * eleventhNumber * eleventhNumber);
    }
}

//output
//
//        number   square   cube
//        0         0       0
//        1         1       1
//        2         4       8
//        3         9       27
//        4         16      64
//        5         25      125
//        6         36      216
//        7         49      343
//        8         64      512
//        9         81      729
//        10        100     1000