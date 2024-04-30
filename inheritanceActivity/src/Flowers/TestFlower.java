package Flowers;

public abstract class TestFlower extends Flower{
    int num;

    public TestFlower(String name, String color, int numOfPetals, double height) {
        super(name, color, numOfPetals, height);
    }


    @Override
    public String toString(){
        return String.format("Number", num);
    }
}
