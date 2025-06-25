package array_programs;
//program 62: find all element of an array be equal
public class EqualElementCheck {

	public static void main(String[] args) {
		int []arr= { 2,2,2};
		String check = equalsCheck(arr)?"yes elememt are same":"no elements are different";
		System.out.println(check);
		

	}
	public static  boolean  equalsCheck(int []arr) {
		int first=arr[0];
		for(int num : arr) {
			if(first!=num) {
				return false; 
					
			}
		}
		return true;
	}

}
