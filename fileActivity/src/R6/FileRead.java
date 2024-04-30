package R6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOne = new File("Operators.txt");
        try {
            Scanner scanner = new Scanner(fileOne);
            String header = scanner.nextLine();
            while (scanner.hasNextLine()) {
                String name = scanner.next();
                String ability = scanner.next();
                String equipment = scanner.next();
                int speed = Integer.parseInt(scanner.next());
                int health = Integer.parseInt(scanner.next());
                System.out.printf("%s %s %s %d %d\n", name, ability, equipment, speed, health);
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
