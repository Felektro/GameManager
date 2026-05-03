import java.util.HashMap;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public String gameName;
    public char gameAgeRate;
    public GameTag gameTag;
    public Platform platform;
    public double rating;
    public Game(String gameName, char gameAgeRate, double rating, Platform platform, GameTag gameTag)
    {
        this.gameName = gameName;
        this.gameAgeRate = gameAgeRate;
        this.rating = rating;
        this.platform = platform;
        this.gameTag = gameTag;
    }
    
    public String getGameName()
    {
        return gameName;
    }
    
    public char getAgeRate()
    {
        return gameAgeRate;
    }
    
    public double getRating()
    {
        return rating;
    }
    
    public Platform getPlatform()
    {
        return platform;
    }
    
    public GameTag getGameTag()
    {
        return gameTag;
    }
    
    public String toString()
    {
        return "Game: " + gameName + 
               ". Rated: " + gameAgeRate + 
               ". Rating: " + rating + 
               ". Platform: " + platform + 
               ". GameTag: " + gameTag;
    }
}
