package producerConsumer;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() { // synchronized read method so that both threads execute separately
        while(empty) {
            try {
                wait();// each lock waits and releases its lock on the message object when the loop cond passes and the other thread runs
            } catch(InterruptedException e) {

            }

        }
        empty = true;
        notifyAll(); //the waiting thread can proceed with execution 
        return message;
    }

    public synchronized void write(String message) { // synchronized write method
        while(!empty) {
            try {
                wait();
            } catch(InterruptedException e) {

            }

        }
        empty = false;
        this.message = message;	
        notifyAll();
    }
}

class Writer implements Runnable { // class writing messages
    private Message message;

    public Writer(Message message) {
        this.message = message; // argument msg passed
    }

    public void run() {  
        String messages[] = { // string array
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random(); // instance of random class

        for(int i=0; i<messages.length; i++) { // loop through the messages
            message.write(messages[i]); // writing messages
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable { // class for reading messages
    private Message message; // private msg object

    public Reader(Message message) {// constructor
        this.message = message;
    }

    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); // looping to read
            latestMessage = message.read()) {
            System.out.println(latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e) {

            }
        }
    }
}

