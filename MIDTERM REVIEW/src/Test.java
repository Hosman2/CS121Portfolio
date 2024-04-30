import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!Objects.equals(input, "q")){
            System.out.println("Name a movie and press q to quit.");
            input = scanner.nextLine();
        }
    }
}
