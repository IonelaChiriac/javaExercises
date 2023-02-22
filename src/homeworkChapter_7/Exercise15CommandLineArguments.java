package homeworkChapter_7;

//7.15 (Command-Line Arguments)
// Rewrite Fig. 7.2 so that the size of the array is specified by the first command-line argument.
// If no command-line argument is supplied, use 10 as the default size of the array.

public class Exercise15CommandLineArguments {

    public static void main(String[] args) {

        //initializes a final integer variable called ARRAY_SIZE.
        //if the length of the args array is greater than 0,
        //it sets the value of ARRAY_SIZE to the integer value of the first argument passed in,
        //using Integer.parseInt(). Otherwise, it sets the value of ARRAY_SIZE to 10
        final int ARRAY_SIZE = args.length > 0 ? Integer.parseInt(args[0]) : 10;

        //initializes a new integer array called array with a size of ARRAY_SIZE
        int[] array = new int[ARRAY_SIZE];

        System.out.printf("%s%8s%n", "Index", "Value");

        //loop that will iterate over the array and execute the code inside the block for each element in the array
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}

//output
//Index   Value
//    0       0
//    1       0
//    2       0
//    3       0
//    4       0
//    5       0
//    6       0
//    7       0
//    8       0
//    9       0