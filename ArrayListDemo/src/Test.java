
public class Test {
    public static void main(String[] args) {
        StringArrayList Fruit1 = new StringArrayList();
        Fruit1.AddFruit("Apple");
        Fruit1.AddFruit("Orange");
        Fruit1.AddFruit("Banana");
        Fruit1.AddFruit("Strawberry");

        System.out.printf("Fruits contains %d number of elements", Fruit1.GetSize());
        Fruit1.DisplayFruits();
        System.out.printf("\nRemoving the first element: %s", Fruit1.GetIndex());
        Fruit1.RemoveFruit("Strawberry");




    }
}
