import java.util.Scanner;

class ArithmeticOperator{

public static void main(String args[]){

Scanner Ex = new Scanner(System.in);

System.out.println("Enter your First Value:");
int a = Ex.nextInt();

System.out.println("Enter your Second Value:");
int b = Ex.nextInt();

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a/b);
System.out.println(a*b);
System.out.println(a%b);

}

}