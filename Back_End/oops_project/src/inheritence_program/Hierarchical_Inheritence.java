package inheritence_program;

public class Hierarchical_Inheritence {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.riding();
		
		Car car=new Car();
		car.riding();
		
		Bike bike=new Bike();
		bike.riding();
		
		Bicycle bicycle=new Bicycle();
		bicycle.riding();
		
	}
	

}
class Vehicle{
	
	public void riding() {
		System.out.println("vehicle is riding");
	}
}
class Car extends Vehicle{
	
	public void ridding() {
		System.out.println("car is riding");

	}
	
}
class Bike extends Vehicle{
	
	public void ridding() {
		System.out.println("bike is ridding");
	}
	
}
class Bicycle extends Vehicle{
	
	public void ridding() {
		System.out.println("bicycle is ridding");
	}
	
}
