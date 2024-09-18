/*Create a class Employee with attributes such as name, employee ID, and salary. Implement
encapsulation using private access modifiers and provide public methods for accessing and
modifying these attributes.
*/

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void show() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("Kazi Omar", 101, 50000);

        em.show();
        em.setName("Kazi Omar"); // access and modify private attributes
        em.setSalary(550000);
        em.show();
    }
}
