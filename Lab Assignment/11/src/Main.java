/*Implement a class Person with attributes such as name, age, and gender. Use the this keyword
to differentiate between instance variables and parameters with the same name in
constructors and methods.*/

class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void show() {
        System.out.print("Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender);
    }

    public static void main(String[] args) {
        Person p = new Person("Kazi Omar", 25, "Male");
        p.show();
    }
}
