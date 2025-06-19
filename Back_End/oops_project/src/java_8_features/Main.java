package java_8_features;

interface Animal{
	void eats();
	default void Kingdom() {
		System.out.println("Animals belongs to animalia kingdom");
	}
}

class Cat implements Animal{
    @Override
	public void eats() {
		System.out.println("cat eats meat ");
	}
	
}

public class Main {
     public static void main(String[] args) {
	 Animal a=new Cat();
	 a.eats();
	 a.Kingdom();
	 
	 Cat cat=new Cat();
	 cat.eats();
	 cat.Kingdom();

	}

}
