package array_programs;
//Program 63: find the AbsoultDifference 
import java.util.Arrays;

public class MinAbosuluteProgram {

	public static void main(String[] args) {
		int []arr = {3,2,1,4};
		int sum = minAbsoultDifference(arr);
		System.out.println(sum);
		
//    mean :3+2+1+4  /4
//    mode :
//    medium: 1 2 3 4 -3		
	}
	public static int minAbsoultDifference(int []arr) {
		Arrays.sort(arr);//1,2,3,4
		int medium=arr[arr.length/2];
		int sum=0;
		
		for (int num:arr) {
			sum+=Math.abs(num-medium);
		}
		return sum;
	}

}
