package homeworkChapter_8;

//8.4 (Rectangle Class)
// Create a class Rectangle with attributes length and width, each of which defaults to 1.
// Provide methods that calculate the rectangle’s perimeter and area.
// It has set and get methods for both length and width.
// The set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0.
// Write a program to test class Rectangle.


public class Exercise4Rectangle {
    private double length;
    private double width;

    public Exercise4Rectangle() {
        this(1, 1);
    }

    //constructor for the Rectangle class that takes two arguments, length and width
    //it sets the length and width using the setLength and setWidth methods.
    public Exercise4Rectangle(int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }

    //calculates the area of the rectangle
    public double area() {
        return getWidth() * getLength();
    }

    //calculates the perimeter of the rectangle
    public double perimeter() {
        return 2 * (getWidth() + getLength());
    }

    //returns the length of the rectangle
    public double getLength() {
        return length;
    }

    //sets the length of the rectangle, but first checks that the value is between 0.0 and 20.0
    //if the value is outside that range, an IllegalArgumentException is thrown
    public void setLength(double length) {
        if (length <= 0.0 || length >= 20.0)
            throw new IllegalArgumentException("length must be 0-20");

        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0.0 || width >= 20.0)
            throw new IllegalArgumentException("width must be 0-20");

        this.width = width;
    }

    public String toString() {
        return String.format("Rectangle%nWidth: %,.1f%nLength: %,.1f%n", getWidth(), getLength());
    }
}

