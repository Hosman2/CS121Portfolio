import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("What is the first test score?");
        double scoreOne = console.nextDouble();

        System.out.println("What is the second test score?");
        double scoreTwo = console.nextDouble();

        System.out.println("What is the third test score?");
        double scoreThree = console.nextDouble();

        double avg = ((scoreOne + scoreTwo + scoreThree) / 3);
        System.out.println("The average test score is:" + avg);

        String letterGrade;

        if (avg >= 90 && avg <= 100) {
            letterGrade = "A";
        }else if (avg >= 80 && avg <= 89){
            letterGrade = "B";
        }else if (avg >= 70 && avg <= 79){
            letterGrade = "C";
        }else if (avg >= 60 && avg <=69){
            letterGrade = "D";
        }else letterGrade = "F";

        System.out.println("Letter grade for average test scores:" + letterGrade);


    }
}
