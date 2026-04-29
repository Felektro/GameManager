import java.util.HashMap;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public GameTag gameTag;
    public Platform platform;
    String gameName;
    String genre;
    char gameAgeRate;
    public Game(String gameName, char gameAgeRate)
    {
        this.gameName = gameName;
        this.genre = genre;
        this.gameAgeRate = gameAgeRate;
    }
    
    public String getGameName()
    {
        return gameName;
    }
    
    public char getAgeRate()
    {
        return gameAgeRate;
    }
    
    public String getGenre()
    {
        return genre;
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
