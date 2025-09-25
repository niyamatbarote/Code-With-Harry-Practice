//package com.anudip.learning;

public class Person {
    // Initialized member variables
    String name = "John Doe";
    int age = 28;
    int salary = 60000;

    public static void main(String[] args) {
        // Create an instance to access non-static variables
        Person p = new Person();

        // Output for confirmation
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Salary: " + p.salary);
        System.out.println("Test Successful");
    }
}
