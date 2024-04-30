import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {
        double base = 0, height = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the base?");
        base = scanner.nextDouble();
        System.out.println("What is the height?");
        height = scanner.nextDouble();
        double area = ((base * height) / 2);
        System.out.printf("Your area is %f", area);

    }
}
