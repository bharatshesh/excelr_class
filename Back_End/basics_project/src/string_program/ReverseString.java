package string_program;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	  String s=new String("hello");	
      String s="hello"; //inside a pool area
//      String output="olleh";
      String output="";
      
      for (char c: s.toCharArray()) {
    	  output=c+output;
      }
      System.out.println(output);
      
      StringBuilder s1=new StringBuilder("hello");
      
      System.out.println(s1);
      System.out.println(s1.reverse());
      StringBuffer s2=new StringBuffer("hello");
      
	}

}
