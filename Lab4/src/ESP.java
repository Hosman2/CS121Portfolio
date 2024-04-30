import java.util.Random;
import java.util.Scanner;
public class ESP {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String color ="" ;
        String output, input;
        int counter = 0;

        for(int i = 0; i < 10; i++) {

            System.out.println("Guess a color[red,green,blue,yellow,orange]");
            input = scanner.nextLine();


            int computer = rand.nextInt(5);

            if (computer == 0) {
                color = "red";
                System.out.println("The computer choose red");
            } else if (computer == 1) {
                color = "green";
                System.out.println("The computer chose green");
            } else if (computer == 2) {
                color = "blue";
                System.out.println("The computer chose blue");
            } else if (computer == 3) {
                color = "yellow";
                System.out.println("The computer chose yellow");
            } else if (computer == 4) {
                color = "orange";
                System.out.println("The computer chose orange");
            }else{
                System.out.println("invalid");
            }

            if (input.equals(color)) {
                counter = counter + 1;
            }
        }
        output = String.format("You go: %d out of 10", counter);
        System.out.println(output);
    }
}
