import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    public HashSet <Game> games;
    public Library()
    {
        games = new HashSet<>();
    }
    public void addGameAndGenre(Game game)
    {
        games.add(game);
    }
    public void removeGameAndGenre(Game game)
    {
        games.remove(game);
    }
}
