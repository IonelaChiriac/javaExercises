package homeworkChapter_4;

//4.22 (Tabular Output)
// Write a Java application that uses looping to print the following table of values:
//        N	10*N 	100*N 	1000*N

//        1	10		100		1000
//        2	20		200		2000
//        3	30		300		3000
//        4	40		400		4000
//        5	50		500		5000

public class Exercise22TabularOutput {

    public static void main(String[] args) {
        int n = 1;

        // display header
        System.out.println("N\t10*N \t100*N \t1000*N \n");

        while (n <= 5) //in a loop 5 times
        {
            System.out.println(n + "\t" + 10 * n + "\t\t" + 100 * n + "\t\t" + 1000 * n);

            n++; // increment n value
        }
    }
}

//output
//       N	10*N 	100*N 	1000*N
//
//        1	10		100		1000
//        2	20		200		2000
//        3	30		300		3000
//        4	40		400		4000
//        5	50		500		5000


