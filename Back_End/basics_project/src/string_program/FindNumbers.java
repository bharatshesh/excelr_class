package string_program;

public class FindNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s="abc123%#";
    for(int i=0;i<s.length();i++) {
    	char c=s.charAt(i);
//    	if(c>=48&&c<=57) {
//    		     System.out.println(c);
//    	}
    	if(c>='0'&&c<='9')
    		     System.out.println(c);
    }
	}

}
