package Day11Assignments;

public class DemoThread1_ {
	class DemoThread1 implements Runnable {
	    private Thread thread;

	    public DemoThread1() {
	        // Create a new thread and start it
	        thread = new Thread(this);
	        thread.start();
	    }

	    @Override
	    public void run() {
	        // Display a message and counter values from 1 to 10
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("running child Thread in loop: " + i);
	            try {
	                // Put the thread to sleep for 2 seconds
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted.");
	            }
	        }
	    }

	public static void main(String[] args) {
	        // Create 3 objects of DemoThread1
	        new DemoThread1_();
	        new DemoThread1_();
	        new DemoThread1_();
	    }
	}

}
