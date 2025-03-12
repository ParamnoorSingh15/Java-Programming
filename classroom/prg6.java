package classroom;
import java.math.*;
public class prg6 {

	public static void main(String[] args) {
		int num = 19862;
		int digits = 0;
		int last = num%10;
		int num1 = num;
		while(num1!=0) {
			digits = digits + 1;
			num1 = num1/10;
		}
		int first = (int) (num /Math.pow(10, digits-1));
		System.out.printf("%d",last + first);
		

	}

}
