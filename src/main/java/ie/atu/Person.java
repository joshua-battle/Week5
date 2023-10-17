package ie.atu;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int age;

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

    //getting user input
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
    }

    public void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age);
    }
}
