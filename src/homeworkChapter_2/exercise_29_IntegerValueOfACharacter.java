package homeworkChapter_2;

import java.util.Scanner;

//Here’s a peek ahead. In this chapter, you learned about integers and the type int.
// Java can also represent floating-point numbers that contain decimal points, such as 3.14159.
// Write an application that inputs from the user the radius of a circle as an integer
// and prints the circle’s diameter, circumference and area using the floating-point value 3.14159 for π.
// Use the techniques shown in Fig. 2.7. [Note: You may also use the predefined constant Math.PI for the value of π.
// This constant is more precise than the value 3.14159. Class Math is defined in package java.lang.
// Classes in that package are imported automatically, so you do not need to import class Math to use it.]
//Use the following formulas (r is the radius):
//diameter = 2r circumference = 2πr area = πr2
//Do not store the results of each calculation in a variable.
// Rather, specify each calculation as the value that will be output in a System.out.printf statement.
// The values produced by the circumference and area calculations are floating-point numbers.
// Such values can be output with the format specifier %f in a System.out.printf statement. You’ll learn more about floating-point numbers in Chapter 3.
public class exercise_29_IntegerValueOfACharacter {

        // main method begins execution of Java application
        public static void main(String[] args)
        {
            System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));
            System.out.printf("The character %c has the value %d%n", 'B', ((int) 'B'));
            System.out.printf("The character %c has the value %d%n", 'C', ((int) 'C'));
            System.out.printf("The character %c has the value %d%n", 'a', ((int) 'a'));
            System.out.printf("The character %c has the value %d%n", 'b', ((int) 'b'));
            System.out.printf("The character %c has the value %d%n", 'c', ((int) 'c'));
            System.out.printf("The character %c has the value %d%n", '0', ((int) '0'));
            System.out.printf("The character %c has the value %d%n", '1', ((int) '1'));
            System.out.printf("The character %c has the value %d%n", '2', ((int) '2'));
            System.out.printf("The character %c has the value %d%n", '$', ((int) '$'));
            System.out.printf("The character %c has the value %d%n", '*', ((int) '*'));
            System.out.printf("The character %c has the value %d%n", '+', ((int) '+'));
            System.out.printf("The character %c has the value %d%n", '/', ((int) '/'));
            System.out.printf("The character %c has the value %d%n", ' ', ((int) ' '));
        }
}

//output
//        The character A has the value 65
//        The character B has the value 66
//        The character C has the value 67
//        The character a has the value 97
//        The character b has the value 98
//        The character c has the value 99
//        The character 0 has the value 48
//        The character 1 has the value 49
//        The character 2 has the value 50
//        The character $ has the value 36
//        The character * has the value 42
//        The character + has the value 43
//        The character / has the value 47
//        The character   has the value 32