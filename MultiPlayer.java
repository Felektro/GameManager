
/**
 * Write a description of class MultiPlayer here.
 *
 * @author Guy
 * @version (a version number or a date)
 */
public class MultiPlayer extends Game
{
    int maxPlayer;
    public MultiPlayer(String gameName, char gameAgeRate, float rating, int gameID)
    {
        super(gameName,gameAgeRate, rating, gameID);
    }

    public int getMaxPlayers() {
        return maxPlayer;
    }

    public void setMaxPlayers(int maxPlayer) {
        this.maxPlayer = maxPlayer;
    }
}
