import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People person = new People("Cameron", 5);
        person.printInfo();
        System.out.println(person.getName());
        person.setName("Aidan");
        System.out.println(person.getNumber());
        person.setNumber(1);
        person.printInfo();
    }
}
