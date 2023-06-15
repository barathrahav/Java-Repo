import java.util.Scanner;

class NestedIfExample{
public static void main(String args[]){

Scanner Ex=new Scanner(System.in);

System.out.println("Enter your Country");
String country=Ex.nextLine();

if(country.equals("India")){
System.out.println("Your are Eligible to Vote in India");
System.out.println("Enter your age");
int age=Ex.nextInt();
if(age>18){
System.out.println("Your eligible to Vote");
}else{
System.out.println("Sorry Minor is not eligible to Vote");
}}else{
System.out.println("Your are not INDIAN Citizen");
}
}
}