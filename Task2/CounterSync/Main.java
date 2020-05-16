package CounterSync;

public class Main {

	public static void main(String[] args) {
		
		        Countdown countdown = new Countdown(); // creating 2 countdown objects for both threads , both objects stored in heap so no interference

		        CountdownThread t1 = new CountdownThread(countdown);
		        t1.setName("Thread 1");
		        CountdownThread t2 = new CountdownThread(countdown);
		        t2.setName("Thread 2");

		        t1.start();
		        t2.start();
		    }
		}

		class Countdown {

		    private int i;

		    public void doCountdown() {

		        synchronized(this) {
		            for(i=10; i > 0; i--) {
		                System.out.println(Thread.currentThread().getName() + ": i =" + i);
		            }
		        }
		    }
		}

		class CountdownThread extends Thread {
		    private Countdown threadCountdown;

		    public CountdownThread(Countdown countdown) {
		        threadCountdown = countdown;
		    }

		    public void run() {
		        threadCountdown.doCountdown();
		    }
		}