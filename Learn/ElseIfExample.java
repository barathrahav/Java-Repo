import java.util.Scanner;

class ElseIfExample{
public static void main(String args[]){
Scanner Ex=new Scanner(System.in);
System.out.println("Enter your mark");
int mark=Ex.nextInt();
if(mark<=35){
System.out.println("Your grade is F");
}else if(mark>35 && mark<=45){
System.out.println("Your grade is E");
}else if(mark>45 && mark<=55){
System.out.println("Your garde is D");
}else if(mark>55 && mark<=65){
System.out.println("Your grade is C");
}else if(mark>65 && mark<=75){
System.out.println("Your garde is B");
}else if(mark>75 && mark<=85){
System.out.println("Your grade is A");
}else if(mark>85){
System.out.println("Your garde is S");
}
}
}