import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args){
        int rooms = 0,roomsT = 0,occupiedT = 0 ,occupied = 0,vacant = 0;
        double rate = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many floors are there? ");
        int floors = scanner.nextInt();

        for(int i = 0; i < floors; i++){
            System.out.printf("How many rooms are on floor %d? ", i + 1);
            rooms = scanner.nextInt();

            System.out.println("How many rooms on floor are occupied? ");
            occupied = scanner.nextInt();

            //totsal
            roomsT = roomsT + rooms;
            occupiedT = occupiedT + occupied;
        }
        vacant = roomsT - occupiedT;
        rate = (double)occupiedT / roomsT;
        System.out.println(rooms);
        System.out.println("Floors:" + floors);
        System.out.println("Rooms:" + roomsT);
        System.out.println("Occupied rooms:" + occupiedT);
        System.out.println("Vacant rooms:" + vacant);
        System.out.println("Occupancy:" + rate);
    }
}
