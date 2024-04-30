import java.util.Scanner;
public class BookClubPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int points;

        System.out.println("Number of books purchased:");
        double booksPurchased = console.nextDouble();
        if (booksPurchased == 0) {
            points = 0;
        } else if (booksPurchased == 1) {
            points = 5;
        }else if (booksPurchased ==2) {
            points = 15;
        }else if (booksPurchased == 3) {
            points = 30;
        }else if (booksPurchased >= 4) {
            points = 60;


            System.out.println("Your points are:" + points);
        }

    }
}