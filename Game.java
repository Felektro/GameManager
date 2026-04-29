import java.util.HashMap;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    String gameName;
    String platform;
    String genre;
    char gameAgeRate;
    public Game(String gameName, String platform, char gameAgeRate)
    {
        this.gameName = gameName;
        this.platform = platform;
        this.genre = genre;
        this.gameAgeRate = gameAgeRate;
    }
    public String getGameName()
    {
        return gameName;
    }
    public String getPlatform()
    {
        return platform;
    }
    public char getAgeRate()
    {
        return gameAgeRate;
    }
    public String getGenre()
    {
        return genre;
    }
}
