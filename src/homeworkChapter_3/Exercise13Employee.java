package homeworkChapter_3;

//3.13 (Employee Class)
//        Create a class called Employee that includes three instance variables
//        a first name (type String), a last name (type String) and a monthly salary (double).
//        Provide a constructor that initializes the three instance variables.
//        Provide a set and a get method for each instance variable.
//        If the monthly salary is not positive, do not set its value.
//        Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
//        Create two Employee objects and display each object’s yearly salary.
//        Then give each Employee a 10% raise and display each Employee’s yearly salary again.
public class Exercise13Employee {
    // Declare three instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor with three parameters
    public Exercise13Employee(String fname, String lname, double msalary) {

    //Initialize the three instance variables
        setfirstName(fname);
        setlastName(lname);
        setmonthlySalary(msalary);
    }

    //set and get methods for each instance variable

    // set method of firstName
    public void setfirstName(String fname) {
        firstName = fname;
    }

    // get method of firstName
    public String getfirstName() {
        return firstName;
    }

    // set method of lastName
    public void setlastName(String lname) {
        lastName = lname;
    }

    // get method of lastName
    public String getlastName() {
        return lastName;
    }

    // set method of monthlySalary
    public void setmonthlySalary(double salary) {

    //If the monthly salary is not positive, do not //set its value. Otherwise, set the value in //monthlySalary
        if (salary > 0)
            monthlySalary = salary;
        else
            System.out.println("Invalid case: Salary should be a positive number");
    }

    //get method of monthlySalary
    public double getmonthlySalary() {
        return monthlySalary;
    }
}
