package exception_program;

public class Example_6 {
	
	public static void m1() throws Exception  {
	 int[] arr = {1,2,3};
	 for ( int i = 0; i <= arr.length; i++) {
		 System.out.println(arr[i]);
		 
	 }
   }
	
	public static void main(String[] args) throws Exception{
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		m1();
	}
	


}
