package string_program;

public class FindLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String a="java";
         char []arr=a.toCharArray();
         int length=arr.length;
         System.out.println(length);
//       with out inbuilt methods
         int stringlength=0;
         try {
//        	   while(true) {
//        		         a.charAt(stringlength);
//        		         stringlength++;
//        	   }
        	   for(;true;stringlength++) {
        		   a.charAt(stringlength);
        	   }
        	 
         }
         catch (Exception e) {
        	 
         }
         System.out.println(stringlength+" without inbuilt");
         
	}

}
