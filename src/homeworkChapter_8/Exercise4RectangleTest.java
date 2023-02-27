package homeworkChapter_8;

//8.4 (Rectangle Class)
// Create a class Rectangle with attributes length and width, each of which defaults to 1.
// Provide methods that calculate the rectangle’s perimeter and area.
// It has set and get methods for both length and width.
// The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0.
// Write a program to test class Rectangle.


public class Exercise4RectangleTest {
    public static void main(String[] args) {
        Exercise4Rectangle rectangle = new Exercise4Rectangle(2, 2);

        System.out.println(rectangle);
        System.out.printf("Rectangle area = %,.1f%n", rectangle.area());
        System.out.printf("Rectangle perimeter = %,.1f ", rectangle.perimeter());
    }
}


//Rectangle
//Width: 2.0
//Length: 2.0
//
//Rectangle area = 4.0
//Rectangle perimeter = 8.0