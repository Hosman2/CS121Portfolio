import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] movieName;
        String [] movieType;
        int [] movieAvailability;
        double [] moviePrice;

        System.out.println("How many movie details would you like to enter?");
        int movies = scanner.nextInt();
        movieName = new String[movies];
        movieType = new String[movies];
        movieAvailability = new int[movies];
        moviePrice = new double[movies];


        for(int i = 0; i < movies; i++){
            System.out.println("Enter in the details for movie" + (i + 1));

            System.out.println("Name of movie:");
            movieName[i] = scanner.next();

            System.out.println("Movie type:");
            movieType[i] = scanner.next();

            System.out.println("Number of seats available:");
            movieAvailability[i] = scanner.nextInt();

            System.out.println("Price:");
            moviePrice[i] = scanner.nextDouble();
        }

        printInfo(movieName, movieType, movieAvailability, moviePrice);


    }
    public static void printInfo(String [] movieName, String [] movieType, int [] availability, double [] price){
        System.out.printf("MovieDetails\n%-20s %-15s %-20s %-10s\n", "Name", "Type", "Seats Available", "Price");
        for(int i = 0; i < movieName.length; i++){
            System.out.printf("%-20s %-15s %-20d %-10.2f\n ", movieName[i], movieType[i], availability[i], price[i]);
        }
    }

}
