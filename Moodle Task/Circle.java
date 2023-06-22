import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner radiusin = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = radiusin.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
