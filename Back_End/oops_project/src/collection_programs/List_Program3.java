package collection_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>l=new ArrayList<String>();
		l.add("Orange");
		l.add("Yellow");
		l.add("Pink");
		l.add("Green");
        l.add("Blue");
        
		ListIterator<String> li = l.listIterator();
		System.out.println("--------forword---------");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
		System.out.println("--------backword---------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println("---------adding---------");
		System.out.println(l);
		while(li.hasNext()) {
			String color=li.next();
			if(color.equals("Pink"))
				li.add("Black");
		}
		System.out.println(l);
		
		System.out.println("---------updating---------");
		System.out.println(l);
		while(li.hasPrevious()) {
			String color=li.previous();
			if(color.equals("Orange"))
				li.set("White");
		}
		System.out.println(l);
	}

}
