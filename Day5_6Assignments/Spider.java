package Day5_6Assignments;

public class Spider extends Animal {
	  private String Name;
	public Spider(String name) {
		// TODO Auto-generated constructor stub
		  super(8);
		  this.Name= name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(Name+" eats insects...");
		
	}


}
