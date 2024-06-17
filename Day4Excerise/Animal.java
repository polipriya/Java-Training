package Day4Excerise;

public class Animal {
	public void shout() {
	     System.out.println("Some generic animal sound");
	 }
	}
	class Cat extends Animal {
		 @Override
		 public void shout() {
		     System.out.println("Meow! Meow!");
		 }
	}
	

	class Dog extends Animal {
		 @Override
		 public void shout() {
		     System.out.println("Woof! Woof!");
		 }
	}
	
	class Horse extends Animal {
		 @Override
		 public void shout() {
		     System.out.println("Neigh! Neigh!");
		 }
	}


