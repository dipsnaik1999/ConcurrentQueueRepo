package QueueClasses;

	import java.util.concurrent.*;

	// The DelayObject for DelayQueue
	// It must implement Delayed and
	// its getDelay() and compareTo() method
	
	class DelayedElement implements Delayed {

		private String element;
		private long time;

		// Constructor of DelayObject
		public DelayedElement(String element, long delayTime, TimeUnit seconds)
		{
			this.setElement(element);
			this.time = System.currentTimeMillis() + delayTime;
		}

		// Implementing getDelay() method of Delayed
		@Override public long getDelay(TimeUnit unit)
		{
			long diff = time - System.currentTimeMillis();
			return unit.convert(diff, TimeUnit.MILLISECONDS);
		}

		// Implementing compareTo() method of Delayed
		@Override public int compareTo(Delayed obj)
		{
			if (this.time < ((DelayedElement)obj).time) {
				return -1;
			}
			if (this.time > ((DelayedElement)obj).time) {
				return 1;
			}
			return 0;
		}

		// Implementing toString() method of Delayed
		@Override public String toString()
		{
			return "\n{"
				+ " " + time + ", time=" + time + "}";
		}
	

		public String getElement() {
			return element;
		}

		public void setElement(String element) {
			this.element = element;
		}


		public class DelayQueueExample {

			DelayQueue<DelayedElement> queue = new DelayQueue<>();
		{

			// create object of DelayQueue
			// using DelayQueue() constructor
			BlockingQueue<DelayedElement> DQ = new DelayQueue<DelayedElement>();
		
			// Print delayqueue
			System.out.println("Original DelayQueue: " + DQ + "\n");
		
			// removing all elements
			DQ.clear();
		}
	
			public static void main(String[] args) throws InterruptedException {
				DelayQueue<DelayedElement> queue = new DelayQueue<>();

				queue.put(new DelayedElement("Element1", 5, TimeUnit.SECONDS));
				queue.put(new DelayedElement("Element2", 3, TimeUnit.SECONDS));
				queue.put(new DelayedElement("Element3", 10, TimeUnit.SECONDS));

				System.out.println("Elements added to the DelayQueue");

				while (!queue.isEmpty()) {
					DelayedElement element = queue.take();
					System.out.println("Processing: " + element);
					
		}
	}

		}
}


