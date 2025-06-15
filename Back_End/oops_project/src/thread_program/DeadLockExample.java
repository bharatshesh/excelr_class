package thread_program;

public class DeadLockExample {
	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
	}
	

}

class ThreadA{
	synchronized void methodA(){
	System.out.println("Thread A locked");	
	}
	synchronized void common() {
		System.out.println("inside A");
	}
}
class ThreadB{
	synchronized void methodB() {
	System.out.println("Thread B locked");	
	}
	synchronized void common() {
		System.out.println("inside B");
	}
	
}