package exception_program;

public class Excption_1 {

	public static void main(String[] args) {
		String b="1234rt";
		try {
		     int value=Integer.parseInt(b);
		}
		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("exception occuur");
			System.out.println(e.getMessage());
		}

	}

}

