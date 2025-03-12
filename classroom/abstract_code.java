package classroom;

abstract class A{
	abstract void logic();
	abstract void logic2();
	void fun() {
		System.out.println("this is fun method");	
	}
}

public class abstract_code extends A{
	
	void logic() {
		System.out.println("logic method !!");
	}
	void logic2() {
		System.out.println("logic 2 method !!");
	}

	public static void main(String[] args) {
		
		A obj = new A(); // --> Error cant create object if abstract class 

	}

}
