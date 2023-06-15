import java.util.Scanner;

class SwitchExample{
public static void main(String args[]){

Scanner Ex=new Scanner(System.in);

System.out.println("Enter your Ratings for Sura (1-5)");
int rating=Ex.nextInt();

switch(rating){

case 1: System.out.println("Thanks for your rating, Pray for 500 days running");
break;
case 2: System.out.println("Thanks for your rating, Pray for 400 days running");
break;
case 3: System.out.println("Thanks for your rating, Pray for 300 days running");
break;
case 4: System.out.println("Thanks for your rating, Pray for 200 days running");
break;
case 5: System.out.println("Thanks for your rating, Pray for 100 days running");
break;
default: System.out.println("Please Enter your rating between 0 to 5");
}
}
}