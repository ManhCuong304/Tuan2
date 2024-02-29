package myPackage;

public class Calculation {
	private double a, b;
	
	public Calculation(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double sum() {
		return a + b;
	}
	
	public double minus() {
		return a - b;
	}
	
	public double mul() {
		return a * b;
	}
	
	public double div() {
		return a / b;
	}
	
	public static void main(String[] args) {
		Calculation c = new Calculation(3,2);
		System.out.println("tong " + c.sum());
		System.out.println("hieu " + c.minus());
		System.out.println("tich " + c.mul());
		System.out.println("thuong  " + c.div());
	}
}