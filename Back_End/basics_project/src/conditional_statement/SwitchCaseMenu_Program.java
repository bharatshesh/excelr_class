package conditional_statement;

import java.util.Scanner;

public class SwitchCaseMenu_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      * Idly
      * Dosa
      * vada 
      */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.idly \n2.dosa \n3.vada");
		String order=sc.next();
		
		switch (order) {
		case "idly": System.out.println("idly -20$");break;
		case "dosa": System.out.println("dosa -30$");break;
		case "vada": System.out.println("vada -40$");break;

		default:System.out.println("not availble...");
			break;
		}
	}

}
