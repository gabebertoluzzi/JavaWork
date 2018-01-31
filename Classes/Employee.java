public class Employee {

    // Static variables
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getID() {
        return this.id;
    }

    // Getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return this.lastName;
    }

    // Getter for full name
    public String getName() {
        return this.firstName + this.lastName;
    }

    // Getter for salary
    public int getSalary() {
        return this.salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter for annual salary
    public int getAnnualSalary() {
        return this.salary * 12;
    }

    // setter for salary raise
    public int raiseSalary(int raise) {
        this.salary = this.salary + (this.salary * (raise / 100));
        return this.salary;
    }

    public String toString(){
        return "Employee[id= " + this.id + ", name= " + firstName + " " + lastName + ", salary= " + this.salary + "]";
    }

}