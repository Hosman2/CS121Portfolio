
public class Flower {
    //instant variables/Fields - member variable
    String name, color;
    int numOfPetals, sizeOfFlower;

    //member variables go in the parenthesis but different variables
    public Flower(String Name, String Color,int NumOfPetals,int SizeOfFlower){
        this.name =  Name;
        this.color = Color;
        this.numOfPetals = NumOfPetals;
        this.sizeOfFlower = SizeOfFlower;
    }
    public void displayInfo(){
        System.out.println("This is the name of the flower: " + name);
        System.out.println("This is the color of the flower: " + color);
        System.out.println("This is the number of petals: " + numOfPetals);
        System.out.println("This is the size of the flower: " + sizeOfFlower);
    }

}
