import java.util.*;
abstract class Shape {
    public double dimension1;
    public double dimension2;
    public void inputDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension 1: ");
        dimension1 = sc.nextDouble();
        System.out.print("Enter dimension 2: ");
        dimension2 = sc.nextDouble();
    }

    public abstract double computeArea();
}
class Triangle extends Shape {
    @Override
    public double computeArea() {
        return 0.5 * dimension1 * dimension2;
    }
}
class Rectangle extends Shape {
    @Override
    public double computeArea() {
        return dimension1 * dimension2;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape type (triangle/rectangle): ");
        String shapeType = sc.nextLine();

        if (shapeType.equalsIgnoreCase("triangle")) {
            shape = new Triangle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            shape = new Rectangle();
        } else {
            System.out.println("Invalid shape type.");
            return;
        }

        shape.inputDimensions();
        double area = shape.computeArea();
        System.out.printf("The area of the %s is: %.2f\n", shapeType, area);
    }
}
