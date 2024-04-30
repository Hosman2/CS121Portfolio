import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericArrayList generic = new GenericArrayList();
        Integer[] intArray = {1, 2, 3, 4, 5};
        //generic array
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"Mom ", "Dad ", "Sister ", "Brother ", "Me "};

        System.out.print("Integer array: ");
        generic.printArrayList(intArray);
        System.out.print("Double array: ");
        generic.printArrayList(doubleArray);
        System.out.print("Character array: ");
        generic.printArrayList(charArray);
        System.out.print("String array: ");
        generic.printArrayList(stringArray);
    }
}
