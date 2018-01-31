public class TestEmployee {
    public static void main(String[] args) {
        // Declare instance of Employee
        Employee e1 = new Employee(1234, "John", "Doe", 3000);

        // Invoke the public methods (getters)
        System.out.println("The employee created is " + e1.getName() + " with id " + e1.getID() + " and makes " + e1.getSalary() + " per month and annual salary of " + e1.getAnnualSalary());
        
        // Setter for salary.
        e1.setSalary(6666);
        System.out.println("New salary is " + e1.getSalary());

        // toString() test
        System.out.println(e1);
        System.out.println(e1.toString());
    
    }

}