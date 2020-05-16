package Thread;

public class AnotherThread extends Thread {
	
	public void run() {
		System.out.println("Hello from "+ currentThread().getName());
	
	try {
		Thread.sleep(5000);
	}
	catch(InterruptedException e) {
		System.out.println("Another thread interrupted and woke me up");
		return;
	}
	System.out.println("Three seconds passed I woke up");

}
}
