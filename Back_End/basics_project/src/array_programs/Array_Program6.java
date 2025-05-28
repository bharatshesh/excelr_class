package array_programs;

public class Array_Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] []arr= {{10,20,30},{40,50,60},{70,80,90}};
       int [] []arr1= {{100,200,300},{400,500,600},{700,800,900}};
       
       for (int i=0;i<arr.length;i++) {
    	   for (int j = 0; j < arr[i].length; j++) {
    		   System.out.println(arr[i][j]+" +"+arr1[i][j]+"="+(arr[i][j]+arr1[i][j]));
    	   }
    	   System.out.println();
       }
       
       for (int i=0;i<arr.length;i++) {
    	   for (int j = 0; j <arr[i].length;j++) {
    		   System.out.println(arr[i][j]+" *"+arr1[i][j]+"="+(arr[i][j]*arr1[i][j]));
    	   }
    	   System.out.println();
       }
	}

}
