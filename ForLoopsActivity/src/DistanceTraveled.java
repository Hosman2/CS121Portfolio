import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Hour      Distance");
        System.out.println("******************");
        System.out.println("What is the speed?");
        double speed = console.nextDouble();
        System.out.println("Number of hours traveling:");
        double hour = console.nextDouble();
        double dist;
        for(int i = 1; i <= hour;i++){
            dist = (speed * i);
            System.out.println(i+"\t"+dist);
        }

    }
}
