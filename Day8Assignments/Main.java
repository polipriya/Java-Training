package Day8Assignments;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input for Person
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine();  // Consume the newline left-over

	        // Input for Student
	        System.out.print("Enter university: ");
	        String university = scanner.nextLine();
	        System.out.print("Enter degree: ");
	        String degree = scanner.nextLine();

	        // Create Student object
	        Student student = new Student(name, age, university, degree);

	        // Display Student details
	        student.display();

	        scanner.close();
	    }
}
