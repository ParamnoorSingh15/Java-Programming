package classroom;
import java.util.*;

public class prg3 {

	public static void main(String[] args) {
		
		// u need to find even number between 1 - n , min value of n is 20
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter a number ");
		int num  = sc.nextInt();
		
		System.out.println("Even numbers from 1 to n");
		
		for(int i = 1; i<=num; i++) {
			if(i%2==0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
		
		System.out.println("Odd numbers from 1 to n");
		

		for(int i = 1; i<=num; i++) {
			if(i%2!=0) {
				System.out.printf("%d ",i);
			}
		}
		
		sc.close();

	}

}
