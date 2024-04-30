package R6;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileAppend {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try{

            FileWriter filewrite = new FileWriter("Operators.txt", true);
            PrintWriter output = new PrintWriter(filewrite);

            System.out.println("Enter the operators name: ");
            String name = scanner.nextLine();
            System.out.println("What is the ability of the operator: ");
            String ability = scanner.nextLine();
            System.out.println("What is the equipment: ");
            String equipment = scanner.nextLine();
            System.out.println("What is the speed: ");
            int speed = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the health: ");
            int health = Integer.parseInt(scanner.nextLine());
            output.printf("%n %s %s %s %s %s", name, ability, equipment, speed, health);

            filewrite.close();
            output.close();
        }catch(FileNotFoundException e){
            System.err.println("Your file wasn't found.");
        }



    }
}
