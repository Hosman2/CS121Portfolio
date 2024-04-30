package Flowers;

public class Lily extends Flower {
    String size;
    public Lily(String name, String color, int numOfPetals, double height, String size){
        super(name, color, numOfPetals, height);
        this.size = size;
    }
    //method

    @Override
    public String toString(){
        return String.format("Size %s", size);
    }
    @Override
    public double displayHeight(){
        return height;
    }



}
