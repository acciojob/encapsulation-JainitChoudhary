package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to 'name' directly
        // Error: 'name' has private access in RWOnly
        // obj.name = "John"; // This will result in an error

        // Task 4: Try printing 'name' directly
        // Error: 'name' has private access in RWOnly
        // System.out.println(obj.name); // This will result in an error

        // Task 6: Set a value to 'name' using setter function
        obj.setName("John");

        // Task 6: Access the value of 'name' using getter function
        System.out.println("Name: " + obj.getName()); // Output: Name: John
    }
}
