import java.util.ArrayList;

/**
 * Write a description of class MultiPlayer here.
 *
 * @author Illia
 * @version (a version number or a date)
 */

public class Library
{
    public ArrayList <Game> games;
    
    public Library()
    {
        games = new ArrayList<>();
        
        addGame(new Game("test_game1", 'E', 5.5f, 1));
        addGame(new Game("test_game2", 'T', 5.6f, 2));
        addGame(new Game("test_game3", 'A', 5.6f, 3));
        
        for(int i = 0; i < 3; i++){
            games.get(i).addPlatform(Platform.PC);
            games.get(i).addPlatform(Platform.XBOX);
            games.get(i).addPlatform(Platform.MOBILE);
            
            games.get(i).addGameTag(GameTag.INDIE);
            games.get(i).addGameTag(GameTag.AAA);
            games.get(i).addGameTag(GameTag.TWOD);
        }
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
            System.out.println(g);
        }
    }
}
