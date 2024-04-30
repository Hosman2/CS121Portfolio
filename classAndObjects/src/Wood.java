public class Wood {
    String color, name;
    int size, amount;


    public Wood(String Color, String Name, int Size, int Amount){
        this.color = Color;
        this.name = Name;
        this.size = Size;
        this.amount = Amount;
    }
    public void displayInfo(){
        System.out.println("This is the color: " + color);
        System.out.println("This is the name: " + name);
        System.out.println("This is the size: " + size);
        System.out.println("This is the amount: " + amount);
    }
}
