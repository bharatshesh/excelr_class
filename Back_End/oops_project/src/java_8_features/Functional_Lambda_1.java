package java_8_features;

@FunctionalInterface

interface F_L{
	void m1();

	
}
public class Functional_Lambda_1 implements F_L {
	
	@Override
	public void ml() {
		System.out.println("single abstract methods ......");

	}
	public static void main(String[] args) {
//      upCasting 		
		F_L f=new Functional_Lambda_1();
		f.m1();
		
	}

}
