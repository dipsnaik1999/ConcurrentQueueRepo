package QueueClasses;

public class ConcurrentLinkedQueue {
	
	
		public static void main(String[] args)
		{
			ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();

			// Add String to queue using add method
			
	        queue.add("Kolkata");
	        queue.add("Patna");
	        queue.add("Delhi");
	        queue.add("Jammu");

			// Removing elements from the queue
	
			System.out.println("First Element is: "
                    + queue.peek());
			System.out.println("Head Element is: "
                    + queue.poll());

		}
		

		private void add(String string) {
			// TODO Auto-generated method stub
			
		}

		private String peek() {
			// TODO Auto-generated method stub
			return null;
		}

		private String poll() {
			// TODO Auto-generated method stub
			return null;
		}
}

		
		