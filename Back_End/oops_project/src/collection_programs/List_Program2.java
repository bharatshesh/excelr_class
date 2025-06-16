package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Program2 {
	
    public static void main(String[] args) {
		
		List<String>l=new ArrayList<String>();
		l.add("Orange");
		l.add("Yellow");
		l.add("Pink");
		l.add("Green");
		System.out.println("using gor each loop");
		for(String color:l) {
		System.out.println(color);		
		}
		
//		for(String color:l) {
//			if(color.equals("Yellow"))
//				l.remove(color);
//			
//		} ConcurrentModificationException
		System.out.println(l);//[Orange, Yellow, Pink, Green]
		
		Iterator<String> itertaor = l.iterator();//converts list to iterator
		while(itertaor.hasNext()) {// element present or not 
			String s=itertaor.next();// use to access 
			if(s.equals("Yellow"))
				itertaor.remove();// removing element from iterator
			
		}
		System.out.println(l);//[Orange, Pink , Green]
	}
}
