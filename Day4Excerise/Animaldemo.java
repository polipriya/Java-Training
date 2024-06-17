package Day4Excerise;

public class Animaldemo {
	

		 public static void main(String[] args) {
		     // Creating instances of Animal subclasses
		     Animal dog = new Dog();
		     Animal horse = new Horse();
		     Animal cat = new Cat();

		     // Making each animal shout using the Animal variable
		  // Outputs: Woof! Woof!
		     dog.shout();  
		  // Outputs: Neigh! Neigh!
		     horse.shout(); 
		     // Outputs: Meow! Meow!
		     cat.shout();   
		}

}



