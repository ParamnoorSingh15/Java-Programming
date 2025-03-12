package Assigment;

import java.util.Scanner;

public class ques3 {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.printf("Sum of two numbers is:  %d\n", a+b);
		System.out.printf("Differnce of two numbers is:  %d\n", a-b);
		System.out.printf("Product of two numbers is:  %d\n", a*b);
		System.out.printf("Division of two numbers is:  %d\n", a/b);
		
		
		sc.close();
		
	}

}
