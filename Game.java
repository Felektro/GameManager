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
    public Game(String gameName, char gameAgeRate, double rating)
    {
        this.gameName = gameName;
        this.gameAgeRate = gameAgeRate;
        this.rating = rating;
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
    
    public String platformOfGame(Platform platform)
    {
        return switch(platform){
            case PC -> "Made for PC";
            case PLAYSTATION -> "Made for PlayStation";
            case XBOX -> "Made for Xbox";
            case SWITCH -> "Made for Switch";
            case MOBILE -> "Made for Mobile";
        };
    }
    
    public String TagOfGame(GameTag gameTag)
    {
        return switch(gameTag){
            case INDIE -> "Indie";
            case AAA -> "AAA";
            case TWOD -> "2D";
            case THREED -> "3D";
            case F2P -> "Free To Play";
            case ADVENTURE -> "Adventure";
            case STRATEGIE -> "Strategie";
        };
    }
}
