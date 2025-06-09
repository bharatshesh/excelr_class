package exception_program;

public class Example5 {
	
/**
 *  Throwable
 *     |
 *     |
 *  Exception
 *     |
 *     |
 *  RunTimeException
 *     |
 *     |
 *  ArthmeticException   
 */

	public static void main(String[] args) {
		try {
//   		int a=10/0; //ArthmeticException
			int a=Integer.parseInt("absa");//NumberformatExceptionx
			
		}
		catch (Throwable e) { //collects all child exception // upCasting 
			System.out.println(e.getMessage());
		}

	}

}
