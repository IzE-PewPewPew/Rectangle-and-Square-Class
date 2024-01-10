
import java.util.Scanner;
public class RectangleAndSquareClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width for Rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Enter length for Rectangle: ");
        double rectangleLength = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength);

        System.out.println("\nRectangle Information:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.print("\nEnter side for Square: ");
        double squareSide = scanner.nextDouble();

        Square square = new Square(squareSide);

        System.out.println("\nSquare Information:");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        scanner.close();
    }
}
