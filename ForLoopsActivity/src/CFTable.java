import java.util.Scanner;

public class CFTable {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Celcius    Farrenheit");
        System.out.println("**********************");
        double f;
        for(int i = 1;i < 21;i++){
            f = (9.0/i) + 32;
            System.out.printf("%d\t\t\t%.1f\n",i,f);
        }
    }
}
