/*Design a class Student with encapsulated attributes for student name, roll number, and grade.
Implement a constructor to initialize these attributes and provide getter and setter methods.*/
class Student {
    private String name;
    private int roll;
    private char grade;

    public Student(String name, int roll, char grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void show() {
        System.out.println("Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student("Omar", 101, 'A');
        student.show();

        student.setName("Ayan");
        student.setRoll(102);
        student.setGrade('B');
        student.show();
    }
}
