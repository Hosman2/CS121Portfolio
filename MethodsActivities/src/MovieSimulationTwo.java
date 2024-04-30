public class MovieSimulationTwo {
    public static void main(String[] args) {
        String [] movieName;
        String [] movieType;
        double [] moviePrice;

        //row col

        int [] movieAvailability;
    }
    public static void printInfo(String [] movieName, String [] movieType, int [] availability, double [] price){
        System.out.printf("MovieDetails\n%-20s %-15s %-20s %-10s\n", "Name", "Type", "Seats Available", "Price");
        for(int i = 0; i < movieName.length; i++){
            System.out.printf("%-20s %-15s %-20d %-10.2f\n ", movieName[i], movieType[i], availability[i], price[i]);
        }
    }
}
