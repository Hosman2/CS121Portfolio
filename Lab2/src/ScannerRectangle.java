import java.util.Scanner;

public class ScannerRectangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = console.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = console.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is:" + area);
        double perimeter  = (2 * length) + (2 * width);
        System.out.println("The perimeter of the rectangle is:" + perimeter);
    }
}
