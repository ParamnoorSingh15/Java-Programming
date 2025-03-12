package classroom;

import java.util.Scanner;

class Add{
    int a,b,c;
    void input(int x, int y){
        a=x;
        b=y;
    }
    void cal(){
        c=a+b;
    }
    void display(){
        System.out.printf("%d + %d = %d", a,b,c);
    }
}

public class Main {
    public static void main(String[] args){
        Add obj = new Add(); // to create object { functionName objectName = new functionName() }
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter two number: ");
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        obj.input(x, y);
        obj.cal();
        obj.display();
        sc.close();;
    }
}
