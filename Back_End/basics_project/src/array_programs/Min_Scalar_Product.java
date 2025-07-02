package array_programs;
//67.find minimum scalar product of two arrays
//input: {3,1,2} and {5,4,6}
//       {1,2,3} and {4,5,6}
//        1*6 + 2*5 + 3*4 = 12+10+6 = 28
//    minimum scalar product: 28

import java.util.*;

public class Min_Scalar_Product {

	public static void main(String[] args) {
		int []arr1= {1,2,-4,5,2,6,8};
		Integer []arr2= {4,5,2,9,7,5,4};
		
		if(arr1.length==arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2,Collections.reverseOrder());
			int min=0;
			for(int i=0;i<arr1.length;i++) {
				min+=arr1[i]*arr2[i];
			}
			
			System.out.println("minimum scalar product is "+min);
			
		}else {
			System.out.println("can't find min sclar bcoz both the arrays are not in same size");
		}
	}	
	
}
