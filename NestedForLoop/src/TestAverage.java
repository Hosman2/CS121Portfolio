import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are there?");
        int students = scanner.nextInt();
        System.out.println("How many test scores are there per student?");
        int scores = scanner.nextInt();
        int total=0;
        for(int i = 1; i<=students;i++){
            System.out.println("------------");
            System.out.println("Student " + i);
            System.out.println("------------");
            for(int j = 1; j <=scores;j++) {
                System.out.println("Enter score " + j);
                int num = scanner.nextInt();
                total = total + num;
            }
            double avg = total/scores;
            total = 0;
            System.out.println("Your average is " + avg);

        }
    }
}
