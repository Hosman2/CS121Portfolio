import java.util.Scanner;

public class Rectangle {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double length, width, area;

        length = getLength();
        width = getWidth();
        area = getArea(length,width);
        displayData(length,width,area);
        scanner.close();

    }
    public static double getLength(){
        System.out.println("What is the length of the rectangle?\n");
        double length = scanner.nextDouble();
        return length;
    }

    public static double getWidth(){
        System.out.println("What is the width of the rectangle?\n");
        double width = scanner.nextDouble();
        return width;
    }
    public static double getArea(double l,double w){
        double area = w * l;
        return area;
    }
    public static void displayData(double l, double w, double a){
        System.out.printf("Rectangle length is: %.2f\n", l);
        System.out.printf("Rectangle width is: %.2f\n", w);
        System.out.printf("Rectangle area is: %.2f\n", a);

    }

}
