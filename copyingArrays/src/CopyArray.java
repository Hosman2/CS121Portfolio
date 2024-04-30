import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array elements:");
        //constant
       final int num = Integer.parseInt(scanner.nextLine());
        //System.out.println("Enter array element:" + num);
        //num = 5;
        //System.out.println("The modified variable:" + num);
        int [] array1 = new int [num];
        int [] array2 = new int [num];
        int [] array3 = new int [num];
        int [] array4 = new int [num];

        for (int i = 0; i < num; i++ ) {
            System.out.printf("Enter array element %d:", (i));
            array1[i] = Integer.parseInt(scanner.nextLine());

        }

        System.out.println("Original array:");
        for(int i = 0; i<array1.length;i++){

            System.out.printf("%d",array1[i]);
        }
        System.out.println();


        for(int i = 0; i < array1.length;i++){
            array2[i] = array1[i];
        }
        System.out.println("Copy array:");
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%d", array2[i]);
        }
        System.out.println();

        for(int i = 0; i < array1.length;i++){
            array3[i] = (int) Math.pow(array1[i], 2);
        }

        System.out.println("\nArray 3 - squared");
        for (int i = 0; i < array3.length; i++) {
            System.out.printf("%d", array3[i]);
        }
        System.out.println();

        int j = num -1;
        for(int i = 0; i< array1.length;i++){
            array4[j] = array1[i];
            j--;
        }
        System.out.println("Reversed:");
        for(int i = 0; i< array1.length;i++){
            System.out.printf("%d", array4[i]);
        }

    }
}
