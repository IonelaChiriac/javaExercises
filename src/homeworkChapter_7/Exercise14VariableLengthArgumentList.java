package homeworkChapter_7;

//7.14 (Variable-Length Argument List)
// Write an application that calculates the product of a series of integers
// that are passed to method product using a variable-length argument list.
// Test your method with several calls, each with a different number of arguments.


public class Exercise14VariableLengthArgumentList {

    //calculate the product of series of integers
    // ... rest operator  - 0 or more arguments
    public static int product(int... numbers) {
        //variable named product to store the product result
        int product = 1;

        //for loop to get each integer
        for (int index = 0; index < numbers.length; index++) {
            product *= numbers[index];
        }
        return product;
    }

    //create a main method to execute the program
    public static void main(String[] args) {
        //test the product method with several calls
        //with a different nummber of argunents
        System.out.println("The Product of	5 and 6 is " + product(5, 6));
        System.out.println("The Product of 14, 29 and 78 is " + product(14, 29, 78));
        System.out.println("The Product of 8, 4, 3 and 9 is " + product(8, 4, 3, 9));
        System.out.println("The Product of 9, 7, 2, 6, 3, 6 and 4 is " + product(9, 7, 2, 6, 3, 6, 4));
    }
}

//output
//The Product of	5 and 6 is 30
//The Product of 14, 29 and 78 is 31668
//The Product of 8, 4, 3 and 9 is 864
//The Product of 9, 7, 2, 6, 3, 6 and 4 is 54432