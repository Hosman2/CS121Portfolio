public class Main {
    public static void main(String[] args) {
        VideoGames VideoGame1 = new VideoGames("Terraria", 3, 3452, 23);
        VideoGames VideoGame2 = new VideoGames("Minecraft", 23, 2330, 120);
        VideoGames VideoGame3 = new VideoGames("Siege", 129, 7542, 20);
        System.out.printf("Original game played: %d\n", VideoGame3.getNumGame());
        VideoGame3.setNumGame(14);
        System.out.printf("Set game played: %d\n", VideoGame3.getNumGame());

    }
}
