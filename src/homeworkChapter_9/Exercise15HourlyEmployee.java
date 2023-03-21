package homeworkChapter_9;

public class Exercise15HourlyEmployee extends Exercise15Employee { // extend Employee class
    private double hours;
    private double wage;

    public Exercise15HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (hours < 0 || hours > 168)
            throw new IllegalArgumentException("The hours must be between 0 and 168");

        if (wage < 0)
            throw new IllegalArgumentException("Wage must be >= 0.0");

        this.hours = hours;
        this.wage = wage;
    }

    public double earnings() {
        return getHours() * getWage();
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168)
            throw new IllegalArgumentException("The hours must be between 0 and 168");

        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0)
            throw new IllegalArgumentException("Wage must be >= 0.0");

        this.wage = wage;
    }

    @Override
    public String toString() {
        return String.format("%sHours: %,.2f%nWage: %,.2f", super.toString(), getHours(), getWage());
    }
}

