import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = get.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = get.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
