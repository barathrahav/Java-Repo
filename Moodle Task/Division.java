import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int a = get.nextInt();

        System.out.print("Enter the divisor: ");
        int b = get.nextInt();

        if (b != 0) {
            int quotient = a / b;
            System.out.println("The result of division: " + quotient);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
