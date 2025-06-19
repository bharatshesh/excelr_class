package java_8_features;

//class MyThread implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("running the current thread");
//		
//	}
//	}
public class InnerAnnonymous2 {

	public static void main(String[] args) {
		//creating object for Runnable by using anonymous inner class 
		 Runnable r=new Runnable() {
			 @Override
			public void run() {
				System.out.println("running the current thread");
				
			} 
		 };
	r.run();
	}

}
