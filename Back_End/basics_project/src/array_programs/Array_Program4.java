package array_programs;

import java.util.Arrays;
import java.util.Collections;
//import java.lang.*;

public class Array_Program4 {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
        int []arr= {10,20,30,40,50};
        System.out.println(arr);//address
        System.out.println(Arrays.toString(arr));//[10,20,30,40,50]
        
        int []arr2= {35,23,67,12,8,0,12};
        Arrays.sort(arr2);// sort element in ascending order
        System.out.println(Arrays.toString(arr2));
        
//primitive dt- byte short int long double float char boolean
//Wrappper class Byte Short Integer Long Double Float Character
        
        Integer []arr3= {35,23,67,8,0,12};
        Arrays.sort(arr3,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));
        
        int arr4[]= {1,2,3,4,7};
        int arr5[]= {1,2,3,4,5};
        
        System.out.println(arr4+" "+arr5);
        boolean res=Arrays.equals(arr4, arr5);
        System.out.println(res);
        
        
        int []arr6= {56,34,56,34,67};
//                         existing array             staring Index       ending index(exclus:
        int [] newArr = Arrays.copyOfRange(arr6,1,5);
        System.out.println(Arrays.toString(newArr));
                       
//        int arr7[]= {1,2,3,4,7};
//        int arr8[]= {1,2,3,4,5};
//        int mismatchValue = Arrays.mismatch(arr7, arr8); //address position or -1
//        System.out.println(mismatchValue);
        
        int arr9[]= {34,23,56,67,68};
        Arrays.sort(arr9);
        System.out.println(Arrays.toString(arr9));
        int searchIndex= Arrays.binarySearch(arr9, 67);
        System.out.println(searchIndex);
	}

}
