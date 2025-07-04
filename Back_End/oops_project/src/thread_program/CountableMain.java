package thread_program;

public class CountableMain {

	public static void main(String[] args) throws InterruptedException  {
		 
		Counter counter=new Counter();
		System.out.println("total count :" + counter.getCount());
		
		Thread t1=new Thread(() -> {
			for (int i=  1; i <= 1000; i++) {
				counter.incrememt();
				
			}
		});
		
		Thread t2=new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				counter.incrememt();
			}
		});
         t1.start();
         t2.start();
         t1.join();
         t2.join();
         System.out.println("total count :"+ counter.getCount());
		
	}

}

class Counter {
	private int count;
	
	public int getCount() {
		return this.count;
	}
	
	public synchronized void incrememt() {
		count++;
	}
}
