package R6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("Operators.txt");
        PrintWriter output = new PrintWriter(outputFile);

        output.printf("%s %s %s %s %s","<Operator>", "<Ability>", "<Equipment>", "<Speed>", "<Health>");
        String name, ability, equipment;
        int speed, health;
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 2; i++){
            System.out.println("Enter the operator name: ");
            name = scanner.nextLine();
            System.out.println("What is the ability of the operator: ");
            ability = scanner.nextLine();
            System.out.println("What equipment is selected: ");
            equipment = scanner.nextLine();
            System.out.println("What is the operators speed: ");
            speed = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the characters health: ");
            health = Integer.parseInt(scanner.nextLine());
            output.printf("\n%s %s %s %d %d", name, ability, equipment, speed, health);
        }
        output.close();
    }
}