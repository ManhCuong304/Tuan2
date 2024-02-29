package myPackage;

public class Car {
	int id;
	String name;
	
	public Car(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car(1, "Toyota");
		Car car2 = new Car(2, "Lambo");
		Car car3 = new Car (3, "Vinfast");
	}
}