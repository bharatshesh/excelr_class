package class_program;

public class Task1 {
	{
		System.out.println("non ststic");
	}
	
	static {
		System.out.println("static");
	}
	
	public Task1() {
		System.out.println("object creation");
	}
	
	public static void main(String[] args) {
		System.out.println("main method starts");
		new Task1();//default const 
		new Task1();
		new Task1();
		System.out.println("main method ends");
	}

}
