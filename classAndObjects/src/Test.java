import java.util.Scanner;

public class Test {
    public static void main(String[] args) {



        Flower poppy = new Flower("Poppy", "Red,", 10, 1);
        Flower orchid = new Flower("Blue Orchid", "Blue", 15, 1);
        Flower Lilac = new Flower("Lilac", "Purple", 25, 2);
        Flower Peony = new Flower("Peony", "Pink", 5, 2);
        poppy.displayInfo();
        orchid.displayInfo();
        Lilac.displayInfo();
        Peony.displayInfo();


        Wood oak = new Wood("Light Brown", "Oak", 20, 30);
        Wood Spruce = new Wood("Dark Brown", "Spruce", 40, 80);
        Wood Birch = new Wood("White", "Birch", 10, 30);
        Wood Cherry = new Wood("Pink", "Cherry", 20, 30);
        oak.displayInfo();
        Spruce.displayInfo();
        Birch.displayInfo();
        Cherry.displayInfo();
    }
}
