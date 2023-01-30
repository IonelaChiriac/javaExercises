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
public class EmployeeTest {

    public static void main(String[] args){
        Employee janeEmployee = new Employee("Jane", "Green", 2600.50);
        Employee johnEmployee = new Employee("John", "Blue", 5200.70);

        System.out.printf("Junior employee's first name is %s%n", janeEmployee.getFirstName());
        System.out.printf("Junior employee's last name is %s%n", janeEmployee.getLastName());
        System.out.printf("Junior employee's monthly salary is %.2f%n", janeEmployee.getMonthlySalary());
        System.out.printf("Junior employee's yearly salary is %.2f%n%n", janeEmployee.yearlySalary());

        System.out.printf("Senior employee's first name is %s%n", johnEmployee.getFirstName());
        System.out.printf("Senior employee's last name is %s%n", johnEmployee.getLastName());
        System.out.printf("Senior employee's yearly salary is %.2f%n%n", johnEmployee.yearlySalary());

        System.out.printf("Junior employee's yearly salary with the raise is %.2f%n", janeEmployee.raiseYearlySalary());
        System.out.printf("Senior employee's yearly salary with the raise is %.2f%n", johnEmployee.raiseYearlySalary());

    }

}

//output
//        Junior employee's first name is Jane
//        Junior employee's last name is Green
//        Junior employee's monthly salary is 2600.50
//        Junior employee's yearly salary is 31206.00
//
//        Senior employee's first name is John
//        Senior employee's last name is Blue
//        Senior employee's yearly salary is 62408.40
//
//        Junior employee's yearly salary with the raise is 34326.60
//        Senior employee's yearly salary with the raise is 68649.24