package constructor_program;

public class Book {
	
	int pages;
	String type;
	String name;
	// user- defined 
	public Book(int pages ) {  // arg const
		System.out.println("args const");
		
	}
	public Book() {  // no-arg const
		System.out.println("no args const");
		
	}
	
	public static void main(String[] args) {
		//Book book=new Book();// no args const
		
		Book b2=new Book(100); // args const 
	}

}
