import java.util.Scanner;

public class GCDTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCD gcd = new GCD();
        System.out.println("Enter the first integer: ");
        int inputn1 = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int inputn2 = scanner.nextInt();
        int loop1 = gcd.getForLoop(inputn1, inputn2);
        int loop2 = gcd.getWhileLoop(inputn1, inputn2);
        int loop3 = gcd.getRecursion(inputn1, inputn2);
        System.out.printf("1.for loop gcd: %d\n2. while loop gcd: %d\n3.recursion gcd: %d", loop1, loop2, loop3);
    }
}
