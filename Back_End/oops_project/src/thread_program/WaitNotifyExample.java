package thread_program;

public class WaitNotifyExample{
	
	static Object lock=new Object();
/*
 * synchronized (lock): it ensures mutual execution,
 *                      so only one thread can hold the lock on the object a time 
 *                      so, one thread won't disturb another thread 
 *                      
 * wait(): it causes the current thread thread to release the lock                        	
 */
	
	
	public static void main(String[] args) {
		Thread waiter=new Thread(() -> {
			synchronized (lock) {
				System.out.println("waitting ...");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					
				}
				System.out.println("notified");
				
			}
		});
		
		Thread notifier=new Thread(() ->{ ;
		 synchronized (lock) {
			 System.out.println("notifying ...");
			 lock.notify();
		 }
		waiter.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	});	
		
		notifier.start();
	}

}
