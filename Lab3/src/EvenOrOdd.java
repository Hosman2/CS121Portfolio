import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = console.nextDouble();

        if(num % 2 == 0){
            System.out.println("Your number is even.");

        }else {
            System.out.println("Your number is odd");

        }
        }


    }

