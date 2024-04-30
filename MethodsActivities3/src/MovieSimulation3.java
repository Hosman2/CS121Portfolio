import java.util.Scanner;
import java.util.Random;
public class MovieSimulation3 {
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
        int index = selectMovie(movieName);
        displaySelectedMovie(movieName[index],movieType[index],moviePrice[index]);

        //random
        randomizeAvailability(availability);
        //display
        displaySeatAvailability(availability);

    }
    static void displaySelectedMovie(String movieName, String movieType,double  moviePrice){
        System.out.printf("\n%s  MOVIE SELECTION %s\n", "-".repeat(20),"-".repeat(20));
        System.out.printf("%-20s %-20s%-20s\n", "Name", "Type", "Price");
        System.out.printf("%-25s%-20s$%.2f\n", movieName, movieType, moviePrice);

    }
    static int selectMovie(String movieName[]){
        Scanner scn = new Scanner(System.in);
        String selectedMovie;
        while (true){
            System.out.println("\nEnter the movie name you are purchasing tickets for:");
            selectedMovie = scn.nextLine();
            for(int i = 0; i <movieName.length; i++){
                if(selectedMovie.equalsIgnoreCase(movieName[i])){
                    return i;
                }

            }
            System.out.println("Movie not found. Please try again.\n");
        }

    }

    static void displaySeatAvailability(int [][] availability){
        System.out.println("\n Seating availability: [1 = unavailable ; 0 = available]");
        char[] rowLabel = {'a', 'B', 'C', 'D', 'E'};
        for(int c = 1; c <= availability[0].length; c++){
            System.out.printf("%d ", c);
        }
        System.out.printf("\n %s\n", "-".repeat(20));

        for(int i = 0; i<availability.length; i ++){
            System.out.printf("%c |", rowLabel[i]);
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
