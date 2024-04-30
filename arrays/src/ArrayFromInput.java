import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String names []= {"Cameron", "Lila", "Trevor"};
        float gpa []= {3.4f, 4.0f, 3,7f};
        int number [] = new int[3];

        for(int i = 0; i < number.length; i++) {
            System.out.println("Enter 3 numbers:");
            number[i] = scanner.nextInt();
        }
        System.out.printf("%-7s %s %7s\n","Name","GPA","Numbers");
        for(int i = 0; i < number.length; i++){

            System.out.printf("%-10s %-7s %7d\n", names[i], gpa[i], number[i]);

        }
    }



}
