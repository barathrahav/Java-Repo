import java.util.Scanner;

class TernaryExample{

public static void main(String args[]){

Scanner Ex = new Scanner(System.in);
System.out.println("Enter a number");
int num=Ex.nextInt();
String result =(num % 2 == 0) ? "even":"odd";
System.out.println("The number is "+ result + ".");
}
}