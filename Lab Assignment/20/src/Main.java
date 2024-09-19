class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = (name != null && !name.isEmpty()) ? name : "Unknown";
        this.id = (id > 0) ? id : 1000;
        this.salary = (salary > 0) ? salary : 30000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = (department != null && !department.isEmpty()) ? department : "General";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Manager Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 50000);
        emp1.displayInfo();

        System.out.println("--------------------");

        Manager mgr1 = new Manager("Bob", 102, 80000, "IT");
        mgr1.displayInfo();
    }
}
