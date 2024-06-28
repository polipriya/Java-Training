package Day8Assignments;

class Person1 {
	 String name;
	    int age;

	    // Constructor
	    public Person1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display person details
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

	class Student extends Person {
	    String university;
	    String degree;

	    // Constructor
	    public Student(String name, int age, String university, String degree) {
	        super(name, age);
	        this.university = university;
	        this.degree = degree;
	    }

	    // Overriding display method
	    @Override
	    public void display() {
	        super.display();
	        System.out.println("University: " + university);
	        System.out.println("Degree: " + degree);
	    }
}