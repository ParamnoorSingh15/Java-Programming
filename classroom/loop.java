package classroom;
import java.util.*;
public class loop {
	
	public static void main(String[] args) {
		// Write a program to print 1 to n natural numbers
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the value of n ");
		int num = sc.nextInt();
		for(int i = 1; i<=num;i++) {
			System.out.printf("%d ",i);
		}
		
		// Sum of n natural number
		int sum = 0;
		
		for(int i = 1; i<num; i++) {
			sum+=i;
		}
		
		System.out.printf("\nSum of n natural number is : %d",sum);
		sc.close();
	}
	
	
	
	
	

}
