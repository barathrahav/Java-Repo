import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of the first variable: ");
        int a = in.nextInt();

        System.out.print("Enter the value of the second variable: ");
        int b = in.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First variable = " + a);
        System.out.println("Second variable = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("First variable = " + a);
        System.out.println("Second variable = " + b);
    }
}
