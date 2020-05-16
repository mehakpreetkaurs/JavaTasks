package Thread;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello from main thread");
		
		Thread anotherThread = new AnotherThread(); // instance of another thread class
		anotherThread.setName("==anotherThread==");
		anotherThread.start();
		
		new Thread() {	// anonymous class
			public void run() {
			System.out.println("Hello from anonymous class thread");
			}
		}.start();
		
		Thread myRunnableThread = new Thread(new MyRunnable() { //passed object of new runnable class
		// created new thread based on Myrunnable class
		public void run() {
			System.out.println("Hello from anonymous class implementation of run");
			//super.run(); // running the run method from my runnable class
			try {
				anotherThread.join(2000);
				System.out.println("Another thread terminated or timed out so I'm running");
				
			}
			catch(InterruptedException e) {
				System.out.println("Hello I couldn't wait. I was interrupted");
			}
		}
		});
		myRunnableThread.start();
		anotherThread.interrupt();
		System.out.println("Hello again from thread");
	}

}
