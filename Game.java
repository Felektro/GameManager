import java.util.HashSet;

/**
 * Add your game here! a variety of details! Your game's name, age rating, your rating,
 * the tags and the platforms it could be played on. 
 *
 * @author Guy
 * @version (5/7/2026)
 */
public class Game
{
    public String gameName;
    public char gameAgeRate;
    public int gameID;
    
    public HashSet<GameTag> tags = new HashSet<>();
    public HashSet<Platform> platforms = new HashSet<>();
    
    public float rating; 
    public float playtime = 0.0f;
    
    /**
     * Add a game you desire
     */
    public Game(String gameName, char gameAgeRate, float rating, int gameID)
    {
        this.gameName = gameName;
        this.gameAgeRate = gameAgeRate;
        this.rating = rating;
        this.gameID = gameID; 
    }
    
    /**
     * Returns the game's name
     */
    public String getGameName()
    {
        return gameName;
    }
    
    /**
     * Returns the game's age rate 
     */
    public char getAgeRate()
    {
        return gameAgeRate;
    }
    
    /**
     * Returns the game's rating
     */
    public float getRating()
    {
        return rating;
    }
    
    /**
     * Set a rating for the game
     */
    public void setRating(float rating)
    {
        this.rating = rating;
    }
    
    /**
     * Returns the game's ID
     */
    public int getID()
    {
        return gameID;
    }
    
    /**
     * Sets the game's ID
     */
    public void setID(int gameID)
    {
        this.gameID = gameID;
    }
    
    /**
     * Add a platform/s the game can be played on 
     */
    public void addPlatform(Platform p)
    {
        platforms.add(p);
    }
    
    /**
     * Add a game tag/s the game could have
     */
    public void addGameTag(GameTag t)
    {
        tags.add(t);
    }
    
    /**
     * Gives the complete description of your game
     */
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
    /**
     * Compare this game to another to check for equality
     */
    @Override
    public boolean equals(Object o){
        if(this == o) {return true;}
        if(o == null || (o instanceof Game)) {return false;}
        
        return this.gameID == ((Game)o).gameID;
    }
}
