package Flowers;

public class Test{
    public static void main(String[] args) {
        Lily lily = new Lily("Lily", "yellow", 9, 14, "Small");
        System.out.println(lily.toString());
        System.out.println("Height is of Lily is: " + lily.displayHeight());
        System.out.println(lily.wiltflower());
    }

}
