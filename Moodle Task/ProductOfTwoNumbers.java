import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = get.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = get.nextInt();

        int product = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}
