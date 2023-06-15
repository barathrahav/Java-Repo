import java.util.Scanner;

public class ArithmeticOperationsOne {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = get.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = get.nextInt();

        int sum = num1 + num2;
        int multiply = num1 * num2;
        int subtraction = num1 - num2;
        int division = (int) num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Multiply: " + multiply);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
    }
}