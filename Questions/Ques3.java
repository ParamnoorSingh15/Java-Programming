package Questions;


	
class A{
	void funA() {
		System.out.println("A class method");
	}
	A(){
		System.out.println("A class !!");
	}
}
	
class B extends A{
	B(){
		System.out.println("B class !!");
	}
	void funB() {
		System.out.println("B class method!!");
	}
}
	
	
public class Ques3 {
	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();
		
	}	
}	
	

	
	
		
		
		
		
		
	

