package homeworkChapter_4;

//(Checkerboard Pattern of Asterisks)
// Write an application that uses only the output statements
//System.out.print("* ");
//System.out.print(" ");
//System.out.println();
//to display the checkerboard pattern that follows.
// A System.out.println method call with no arguments causes the program to output a single newline character. [Hint: Repetition statements are required.]
//        * * * * * * * *
//          * * * * * * * *
//        * * * * * * * *
//          * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *
public class Exercise32CheckerBoard {

    public static void main(String[] args)
    {
        int row = 1;
//iterate a loop for 8 times
        while ( row <= 8 )
        {
            int column = 1;
//print the space in even place
            if ( row % 2 == 0 )
                System.out.print( " " );
//print asterisks in a column
            while ( column <= 8 )
            {
                System.out.print( "* " );
                column++;
            }

            System.out.println();
            row++;
        }
    }
}

//output
//        * * * * * * * *
//          * * * * * * * *
//        * * * * * * * *
//          * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *
//        * * * * * * * *
//         * * * * * * * *