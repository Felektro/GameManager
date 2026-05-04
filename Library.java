import java.util.ArrayList;
public class Library
{
    public ArrayList <Game> games;
    
    public Library()
    {
        games = new ArrayList<>();
    }
    
    public void addGame(Game game)
    {
        games.add(game);
    }
    
    public void removeGame(Game game)
    {
        games.remove(game);
    }
    
    public void printAllGames()
    {
        for(Game g: games){
            System.out.println(g.toString());
        }
    }
}
