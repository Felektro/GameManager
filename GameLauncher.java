import java.util.*;

/**
 * Write a description of class MultiPlayer here.
 *
 * @author Illia
 * @version (5/7/2026)
 */

public class GameLauncher
{
    public Game game;
    
    public long startTime;
    public long endTime;
    
    public GameLauncher()
    {
        
    }
    
    public void startGameTime(Game game)
    {
        this.game = game;
        this.startTime = System.currentTimeMillis();
    }
    
    public void endGameTime()
    {
        this.endTime = System.currentTimeMillis();
    }
}
