package thread_program;

public class MyThread extends Thread {
        
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("thread started");
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		
		MyThread myThread2=new MyThread();
		myThread2.start();
		
	}
}
