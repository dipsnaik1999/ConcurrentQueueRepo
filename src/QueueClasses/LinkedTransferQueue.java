package QueueClasses;

import java.util.concurrent.TransferQueue;

public class LinkedTransferQueue {

	 public static void main(String[] args) throws InterruptedException {
		 LinkedTransferQueue transferQueue = new LinkedTransferQueue();
	        // Producer thread
	        Thread producer = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
				    String task = "Task-" + i;
				    transferQueue.transfer(task); // Transfer task to a waiting consumer
				    System.out.println("Produced: " + task);
				}
	        });

	        // Consumer thread
	        Thread consumer = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
				    String task = transferQueue.take(); // Wait for a task to be transferred
				    System.out.println("Consumed: " + task);
				}
	        });

	        producer.start();
	        consumer.start();

	        try {
	            producer.join();
	            consumer.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	private String take() {
		// TODO Auto-generated method stub
		return null;
	}

	private void transfer(String task) {
		// TODO Auto-generated method stub
		
	}
	}

