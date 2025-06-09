package modifer_1;

public class StaticExample2 {
	
	public void m1() {
		System.out.println(StaticExample.a);
		StaticExample.m2();
		
		StaticExample example=new StaticExample();
		System.out.println(example.b);
		example.m1();
	}
	public static void m2() {
		System.out.println(StaticExample.a);
		StaticExample.m2();
		
		StaticExample example=new StaticExample();
		System.out.println(example.b);
		example.m1();
	}

}
