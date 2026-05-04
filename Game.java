import java.util.HashMap;
import java.util.HashSet;

/**
 * Write a description of class Game here.
 *
 * @author Guy
 * @version (a version number or a date)
 */
public class Game
{
    public String gameName;
    public char gameAgeRate;
    public int gameID;
    
    public HashSet<GameTag> tags = new HashSet<>();
    public HashSet<Platform> platforms = new HashSet<>();
    
    public float rating; 
    
    public Game(String gameName, char gameAgeRate, float rating, int gameID)
    {
        this.gameName = gameName;
        this.gameAgeRate = gameAgeRate;
        this.rating = rating;
        this.gameID = gameID; 
    }
    
    public String getGameName()
    {
        return gameName;
    }
    
    public char getAgeRate()
    {
        return gameAgeRate;
    }
    
    public float getRating()
    {
        return rating;
    }
    
    public int getID()
    {
        return gameID;
    }
    
    public void addPlatform(Platform p)
    {
        platforms.add(p);
    }
    
    public void addGameTag(GameTag t)
    {
        tags.add(t);
    }
    
    @Override
    public String toString()
    {
        return "Game: " + gameName + 
               ". Rated: " + gameAgeRate + 
               ". Rating: " + rating + 
               ". Platforms: " + platforms.toString() + 
               ". GameTags: " + tags.toString();
    }
    
    //Author: Illia
    
    @Override
    public boolean equals(Object o){
        if(this == o) {return true;}
        if(o == null || (o instanceof Game)) {return false;}
        
        return this.gameID == ((Game)o).gameID;
    }
}
