public class PersonEmployee {
    String name;
    int age;

    // Constructor for PersonEmployee
    public PersonEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Nested Employee class
    static class Employee extends PersonEmployee {
        String empId;
        double salary;

        // Constructor for Employee
        public Employee(String name, int age, String empId, double salary) {
            super(name, age);
            this.empId = empId;
            this.salary = salary;
        }

        // Method to display employee details
        public void displayEmployee() {
            displayPerson();
            System.out.println("Employee ID: " + empId);
            System.out.println("Salary: " + salary);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 34, "EMP001", 60000);
        emp.displayEmployee();
    }
}
