package ie.atu;

public class Person {
    String firstName = "";
    String lastName = "";
    int age = 0;

    //default constructor to init default values
    public Person(){
        this.firstName = "Joshua";
        this.lastName = "Battle";
        this.age = 20;
    }
    //constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age);
    }
}
