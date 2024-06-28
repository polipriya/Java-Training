package Day11Assignments;

class DemoThread1 extends Thread {
    public void run() {
    	
        for (int i = 1; i <= 5; i++) {
        	
            System.out.println(Thread.currentThread().getName() + ": " + i);
            
            try {
            	
                Thread.sleep(1000);
            } 
            
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        DemoThread1 t1 = new DemoThread1();
        DemoThread1 t2 = new DemoThread1();

        t1.start();
        t2.start();
    }
}

