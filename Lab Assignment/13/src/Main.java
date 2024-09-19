/*Design a class Employee with encapsulated attributes for employee name, ID, and
department. Use method overriding to provide different implementations of the toString method for displaying employee information.*/

class Employee {
    private String name;
    private int ID;
    private String department;

    Employee(String name, int ID, String department) {
        this.name = name;
        this.ID = ID;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + "\nEmployee ID: " + ID + "\nDepartment: " + department;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kazi Omar", 101, "IT");
        System.out.println(emp.toString());
    }
}
