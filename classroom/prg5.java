package classroom;

import java.util.Scanner;

public class prg5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("Enter a number ");
		int  num = sc.nextInt();
		int rem = 0;
		
		while(num != 0) {
			int temp = num%10;
			rem  = rem*10 + temp;
			num = num/10;
		}
		System.out.println(rem);
		sc.close();


	}

}
