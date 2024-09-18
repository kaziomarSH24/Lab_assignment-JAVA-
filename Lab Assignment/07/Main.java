/*Design a nested class Address inside a class Person to represent the address of a person.
Demonstrate how to create an instance of the nested class and access its members.*/

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    class Address {
        String city;
        String country;

        Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        void showAddress() {
            System.out.println(name + " lives in " + city + ", " + country);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kazi Omar");
        Person.Address address = person.new Address("Barishal", "Bangladesh");
        address.showAddress();
    }
}
