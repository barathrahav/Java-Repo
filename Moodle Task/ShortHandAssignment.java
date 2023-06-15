public class ShortHandAssignment {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Initial values:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 += num2;
        num2 -= 3;
        num1 *= 2;
        num2 /= 4;
        num1 %= 3;

        System.out.println("Updated values:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}