package GuviJavaPractices3;

public class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = (percent / 100) * salary;
            salary += raiseAmount;
        }
    }
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: $" + salary + "]";
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", 50000.0);
        System.out.println("Original Employee: " + employee);

        // Raise the salary by 10%
        employee.raiseSalary(10.0);
        System.out.println("Employee after a 10% raise: " + employee);
    }
}

