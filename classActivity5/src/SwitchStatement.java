import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("What is you Hogwarts house?");
        String house = console.nextLine();

        switch (house)
        {
            case "Gryffindor":
                System.out.println("Your emblematic animal is a lion. Your colors are red and gold. Your values are bravery, loyalty, and chivalry.");
                break;
            case "Ravenclaw":
                System.out.println("Your emblematic animal is a raven. Your colors are blue and bronze. Your values are intelligence, earning, wisdom, and wit.");
                break;
            case "Slytherin":
                System.out.println("Your emblematic animal is a serpent. Your colors are silver and green. Your values are ambition, cunning, leadership, and resourcefulness.");
                break;
            case"Hufflepuff":
                System.out.println("Your emblematic animal is a badger. Your colors are yellow and black. Your values are hard work, patience, justice, and loyalty.");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
