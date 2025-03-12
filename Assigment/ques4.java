package Assigment;

public class ques4 {
	
	public static class Circle{
		
		int radius;
		
	

	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void Area() {
		
		System.out.printf("%.2f\n", 3.14*radius*radius);
	}
	
}

	public static void main(String[] args) {
		
		Circle cl = new Circle(3);
		cl.Area();

	}

}
