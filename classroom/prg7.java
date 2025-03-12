import java.util.Scanner;
public class prg_3_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a number: ");
        //String num  = sc.next();
        int num = sc.nextInt(); 
        int num1=num;
        int digits=0;
        while(num1!=0){
            digits++;
            num1/=10;
        }
        int first= (int)(num/(Math.pow(10,digits-1)));
        int last= num%10;
        System.out.println(first);
        System.out.println(last);
        System.out.println("Sum of first and last digits: "+ (first+last));
        if(digits==2){
            int temp = last*10;
            temp+=first;
            System.out.println("First last Swapped : "+ temp);
        }
        if(digits>2){
        int middlePart = (num % (int) Math.pow(10, digits - 1)) / 10;
        int swappedNum = last * (int) Math.pow(10, digits - 1) + middlePart * 10 + first;
        System.out.println("First and Last Swapped: " + swappedNum);     
        }
        sc.close();
    }
}
