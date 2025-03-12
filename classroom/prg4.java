package classroom;
import java.util.*;

public class prg4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("Enter a number ");
		String num = sc.next();
		
		for(int i = 0; i<num.length(); i++) {
			
			System.out.println(num.charAt(i));
			
		}
		
		
		sc.close();

	}

}
