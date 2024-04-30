import java.util.Scanner;

public class ScannerInterest {
    public static void main(String[] args) {
        //Scanner object
        Scanner console = new Scanner(System.in);
        System.out.println("Enter in the principle");
        //double p = Double.parseDouble(console.nextLine());
        double p = console.nextDouble();
        System.out.println("Enter in the annual interest rate");
        double r = console.nextDouble();
        System.out.println("Enter the number of times per year that the interest is compounded");
        double n = console.nextDouble();
        System.out.println("Enter the specified number of years");
        double t = console.nextDouble();
        System.out.println("This is the calculation:");
        double c = n * t;
        double e = (1 + (r / n));
        double b = Math.pow(e,c);
        double a = p * b;
        System.out.println(a);
        }


}