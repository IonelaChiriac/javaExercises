package homeworkChapter_3;

public class Exercise13EmployeeTest {
    public static void main(String[] args) {

        // Create an Employee class object, emp1 for //first employee
        Exercise13Employee emp1 = new Exercise13Employee("Jane", "Green", -4300);

        //Create an Employee class object, emp2 for second employee
        Exercise13Employee emp2 = new Exercise13Employee("John", "Blue", 9500);


        System.out.println("Junior employee details:");
        System.out.println("First name: "+ emp1.getFirstName() + "\nLast name : " + emp1.getLastName());

        System.out.println("Monthly salary:$" + emp1.getMonthlySalary() + "\nYearly salary: $" + (emp1.getMonthlySalary() * 12));
        System.out.println("After salary raise with 10% then yearly salary is:$" + (((emp1.getMonthlySalary() * (0.10)) + emp1.getMonthlySalary()) * 12));


        System.out.println("\nSenior employee details:");
        System.out.println("First name: " + emp2.getFirstName() + "\nLast name : " + emp1.getLastName());
        System.out.println("Monthly salary:$" + emp2.getMonthlySalary() + "\nYearly salary: $" + (emp2.getMonthlySalary() * 12));
        System.out.println("After salary raise with 10% then yearly salary is:$" + (((emp2.getMonthlySalary() * (0.10)) + emp2.getMonthlySalary()) * 12));
    }
}

//output
//        Invalid case: Salary should be a positive number
//        Junior employee details:
//        First name: Jane
//        Last name : Green
//        Monthly salary:$0.0
//        Yearly salary: $0.0
//        After salary raise with 10% then yearly salary is:$0.0
//
//        Senior employee details:
//        First name: John
//        Last name : Green
//        Monthly salary:$9500.0
//        Yearly salary: $114000.0
//        After salary raise with 10% then yearly salary is:$125400.0