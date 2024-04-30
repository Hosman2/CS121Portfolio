import java.util.Random;
import java.util.Scanner;

public class MovieSimulationTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] movieName = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
        String [] movieType = {"2D", "3D", "2D", "Drama/Historical"};
        double [] moviePrice =  {15.25, 20.15, 18.11, 22.12};

        final int ROWS = 5;
        final int COLUMNS = 10;
        int [][] availability = new int[ROWS][COLUMNS];

        //method call
        printInfo(movieName, movieType, moviePrice);
        setSeatAvailability(availability);
        //display
         displaySeatAvailability(availability);
        //random
        randomizeAvailability(availability);
        //display
        displaySeatAvailability(availability);

    }
    static void displaySeatAvailability(int [][] availability){
        System.out.println("\n Seating availability: [1 = unavailable ; 0 = available]");
        for(int i = 0; i<availability.length; i ++){
            for(int j = 0; j < availability[i].length; j++){
                System.out.print(availability[i][j] + " ");
            }
            System.out.println();
        }

    }
    static void randomizeAvailability(int [][] availability){
        Random rand = new Random();
        for(int i = 0; i<availability.length; i ++){
            for(int j = 0; j < availability[i].length; j++){
                availability[i][j] = rand.nextInt(2);
            }
        }
    }
    static void setSeatAvailability(int [][] mAvailable){
        for(int i = 0; i < mAvailable.length; i++){
            for(int j = 0; j < mAvailable[i].length; j++){
                mAvailable[i][j] = 0;
            }
        }
    }
    public static void printInfo(String [] movieName, String [] movieType, double [] price) {
        System.out.printf("----------------MovieDetails------------------\n%-20s %15s%17s\n", "Name", "Type", "Price");
        for (int i = 0; i < movieName.length; i++) {
            System.out.printf("%-16s    %16s      %16.2f\n ", movieName[i], movieType[i], price[i]);
        }
    }
}
