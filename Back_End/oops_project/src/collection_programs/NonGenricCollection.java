package collection_programs;

import java.util.ArrayList;

import java.util.List;

public class NonGenricCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list=new ArrayList(); //non generic 
		
		list.add(10);
		list.add("demo");
		list.add(7899987651);
		
		for(Object o:list) {
//       DownCasting /narrow casting/non primitive casting 
	    Integer i=(Integer)o;//RTE
	    System.out.println(i);
		}
		

	}

}
