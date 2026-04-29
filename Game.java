import java.util.HashMap;
import java.util.HashSet;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    
    String gameName;
    String quote;
    String description;
    
    float score;
    
    HashSet<Platform> platforms = new HashSet<>();
    HashSet<GameTag> tags = new HashSet<>();
    
    public enum Platform {PC, XBOX, PS4};
    public enum GameTag {AAA, TWOD, THREED, F2P};
    
    char gameAgeRate;
    
    public Game(String gameName, String quote, String description, float score, char gameAgeRate)
    {
        this.gameName = gameName;
        this.quote = quote;
        this.
        
        
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
