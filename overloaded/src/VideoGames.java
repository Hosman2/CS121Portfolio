public class VideoGames {
    private String gameName;
    private int numGame;
    private int timePlayed;
    private int numAchievements;

    public VideoGames(){

    }public VideoGames(String videoName){
        this.gameName = videoName;
    }

    public VideoGames(String videoName, int numVideo, int videoPlayed, int videoAchievements){
        this.gameName = videoName;
        this.numGame = numVideo;
        this.timePlayed = videoPlayed;
        this.numAchievements = videoAchievements;
    }

    public String getGameName(){
        return gameName;
    }

    public void setGameName(String newGameName){
        gameName = newGameName;
    }

    public int getNumGame() {
        return numGame;
    }

    public void setNumGame(int newNumGame){
        numGame = newNumGame;
    }

    public int getTimePlayed(){
        return timePlayed;
    }

    public void setTimePlayed(int newTimePlayed){
        timePlayed = newTimePlayed;
    }

    public int getNumAchievements(){
        return numAchievements;
    }

    public void setNumAchievements(int newNumAchievements){
        numAchievements = newNumAchievements;
    }






}
