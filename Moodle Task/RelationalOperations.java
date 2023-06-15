import java.util.Scanner;

public class RelationalOperations {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = get.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = get.nextInt();

        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater: " + isGreater);
        System.out.println("Less: " + isLess);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);
    }
}