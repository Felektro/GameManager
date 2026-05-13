
/**
 * Multiplayer games you can add
 *
 * @author (Guy and Illia)
 * @version (5/7/2026)
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
