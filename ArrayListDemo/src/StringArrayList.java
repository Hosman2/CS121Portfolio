//5 methods total
import java.util.ArrayList;
public class StringArrayList {
    ArrayList<String> fruit = new ArrayList<>();



    public void AddFruit(String fruits){
        fruit.add(fruits);

    }

    public void  RemoveFruit(String fruits){
        fruit.remove(fruits);

    }

    public int GetSize(){
        return fruit.size();
    }
    public String GetIndex() {
        String I = fruit.get(2);

        return I;
    }
    public void DisplayFruits(){
        System.out.println("Fruits: \n");
        for (int i = 0; i < fruit.size(); i++){
            System.out.printf("%s\n", fruit.get(i));
        }
    }
}
