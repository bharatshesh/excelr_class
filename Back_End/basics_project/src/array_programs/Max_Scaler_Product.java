package array_programs;

//68.find   maximum scalar product of two arrays
//input: {3,1,2} and {5,4,6}
//       {1,2,3} and {4,5,6}
//        1*4+ 2*5 + 3*6 = 32
//    maximum scalar product: 32

import java.util.*;

public class Max_Scaler_Product {
	public static void main(String[] args) {
		int []arr1= {1,2,-4,5,2,6,8};
		Integer []arr2= {4,5,2,9,7,5,4};
		
		if(arr1.length==arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int max=0;
			for(int i=0;i<arr1.length;i++) {
				max+=arr1[i]*arr2[i];
			}
			
			System.out.println("minimum scalar product is "+max);
			
		}else {
			System.out.println("can't find min sclar bcoz both the arrays are not in same size");
		}
	}

}
