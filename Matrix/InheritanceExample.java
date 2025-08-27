 // Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class (Single Inheritance)
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // calling parent constructor
        this.department = department;
    }

    void showDepartment() {
        System.out.println("Department: " + department);
    }
}

// Multiple Inheritance using Interfaces
interface Trainer {
    void conductTraining();
}

interface ProjectLead {
    void leadProject();
}

// Class can extend Employee (single inheritance) and implement multiple interfaces
class SeniorManager extends Manager implements Trainer, ProjectLead {

    SeniorManager(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public void conductTraining() {
        System.out.println(name + " is conducting training for employees.");
    }

    @Override
    public void leadProject() {
        System.out.println(name + " is leading a new project.");
    }
}

// Main class
public class InheritanceExample{
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Jara", 90000, "IT");

        // From Employee
        sm.displayDetails();

        // From Manager
        sm.showDepartment();

        // From Trainer (interface)
        sm.conductTraining();

        // From ProjectLead (interface)
        sm.leadProject();
    }
}
