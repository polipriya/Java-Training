package Day8Assignments;

import java.util.Scanner;

public class Person {
	// Data members
    private String name;
    private int age;
    // Constructor
    public Person(String name, int age) {
    	
    	Scanner scanner =new Scanner(System.in);
    	
        this.name = name;
        this.age = age;
    }
    // Member function to display name and age
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Main method to test the Person class
    public static void main(String[] args) {
        // Create an instance of Person
        Person ps = new Person("Priya", 20);
        // Call display method to print name and age
        ps.display();
    }

}
