import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number >= 0) ? "Positive" : "Negative";

        System.out.println("The number is " + result);
    }
}