package string_program;

//72. Print all permutations of a string
//ex: ABC
//    ABC , ACB, BAC, BCA, CAB, CBA 
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		permutate(s,0,s.length()-1);

	}

	private static void permutate(String word, int i, int j) {
		if(i==j) {
			System.out.println(word +",");
		    return;
	
	}
	for (int a=i;a<=j;a++) {
		word=swap(word,i,a);
		permutate(word, i+1, j);
		word=swap(word,i,a);
	}}
  private static String swap(String word, int i, int a) {
	  char[] ch = word.toCharArray();
	  char temp=ch[i];
	  ch[i]=ch[a];
	  ch[a]=temp;
	  return String.valueOf(ch);
  }
}