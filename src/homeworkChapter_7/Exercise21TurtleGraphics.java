package homeworkChapter_7;

//7.21 (Turtle Graphics)
// The Logo language made the concept of turtle graphics famous.
// Imagine a mechanical turtle that walks around the room under the control of a Java application.
// The turtle holds a pen in one of two positions, up or down.
// While the pen is down, the turtle traces out shapes as it moves, and while the pen is up,
// the turtle moves about freely without writing anything.
// In this problem, you’ll simulate the operation of the turtle and create a computerized sketchpad.
//Use a 20-by-20 array floor that’s initialized to zeros.
// Read commands from an array that contains them.
// Keep track of the current position of the turtle at all times and whether the pen is currently up or down.
// Assume that the turtle always starts at position (0, 0) of the floor with its pen up.
// The set of turtle commands your application must process are shown in Fig. 7.29.
//Suppose that the turtle is somewhere near the center of the floor.
// The following “program” would draw and display a 12-by-12 square, leaving the pen in the up position:
//2
//5,12
//3
//5,12
//3
//5,12
//3
//5,12
//1
//6
//9
//As the turtle moves with the pen down, set the appropriate elements of array floor to 1s. When the
//6 command (display the array) is given, wherever there’s a 1 in the array, display an asterisk or any
//character you choose. Wherever there’s a 0, display a blank.
//Write an application to implement the turtle graphics capabilities discussed here. Write several
//turtle graphics programs to draw interesting shapes. Add other commands to increase the power of
//your turtle graphics language.

import java.util.Scanner;

public class Exercise21TurtleGraphics {
        public static boolean penUp() {
            return true;
        }
        public static boolean penDown() {
            return true;
        }
        public static boolean turnLeft(){
            boolean right = false;
            return true;
        }
        public static boolean turnRight(){
            boolean left = false;
            return true;
        }
        public static void printArray(char[][] turtle) {
            for(int i=0;i<20;i++){
                for(int j=0;j<20;j++) {
                    System.out.print(turtle[i][j]);
                }
                System.out.println();
            }
        }
        public static void moveSteps(int steps, char[][] turtle) {


            int j=0, i = 0;
            if(turnLeft() == true) {
                for(;j<steps-1;j++) {
                    turtle[i][j] = '*';
                }
            }

            if(turnRight() == true && (j>0 && i == 0)) {
                for(;i<steps;i++) {
                    turtle[i][j] = '*';
                }
            }

            if(turnRight() == true && (j>0 && i>0)) {
                for(;j>=0;j--) {
                    turtle[i][j] = '*';
                }
            }

            if(turnRight() == true && (j == 0 && i>0)) {
                for(;i>=0;i--) {
                    turtle[i][j] = '*';
                }
            }
        }
        public static void selectCommand(int command) {
            char[][] turtle = new char[20][20];
            switch(command) {
                case 1:
                    penUp();
                    break;
                case 2:
                    penDown();
                    break;
                case 3:
                    turnRight();
                    break;
                case 4:
                    turnLeft();
                    break;
                case 5:
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter number of steps to move");
                    int steps = input.nextInt();
                    moveSteps(steps, turtle);
                    break;
                case 6:
                    printArray(turtle);
                    break;
                case 9:
                    break;
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[][] turtle = new int[20][20];
            int command = 0;
            boolean write = false, right = false, left = false;

            System.out.println("Turtle Graphics Command list");
            System.out.println("1. Pen down");
            System.out.println("2. Pen up");
            System.out.println("3. Turn Right");
            System.out.println("4. Turn Left");
            System.out.println("5,10. Move forward 10 spaces (replace 10 for a different number of spaces)");
            System.out.println("6. Display the 20-by-20 array");
            System.out.println("9. End of data (sentinel)");
            System.out.println("Enter list of commands:");

        }
    }

//output
//Turtle Graphics Command list
//1. Pen down
//2. Pen up
//3. Turn Right
//4. Turn Left
//5,10. Move forward 10 spaces (replace 10 for a different number of spaces)
//6. Display the 20-by-20 array
//9. End of data (sentinel)
//Enter list of commands: