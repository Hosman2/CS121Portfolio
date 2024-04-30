import java.util.Scanner;

public class Sorting {
    Scanner scanner = new Scanner(System.in);

    public int[] getArray(){
        int[] Array = new int[5];
        for (int i = 0; i < 5; i++ ) {
            System.out.printf("Enter array element %d:", (i + 1));
            Array[i] = Integer.parseInt(scanner.nextLine());

        }
        return Array;
    }

    public void sortArray(int[] Array){
        int temp;
        for(int i = 1; i < Array.length; i++){
            for (int j = i; j > 0; j--){
                if(Array[j] < Array[j - 1]){
                    temp = Array[j];
                    Array[j] = Array[j - 1];
                    Array[j - 1] = temp;
                }
            }

        }

    }
}


