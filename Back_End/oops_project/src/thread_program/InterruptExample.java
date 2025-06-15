package thread_program;

public class InterruptExample extends Thread {
	
	
		public void run() {
			for (;isInterrupted();) {
				System.out.println("thread is running");
			
		}
			System.out.println("thread is interrupted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptExample i=new InterruptExample();
		i.start();
//      i.interrupt();
	}

}
