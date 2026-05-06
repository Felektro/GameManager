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
    //option 1
    public String libDetails(){
        return "This library contains " + games.size() + " games!";
    }
    
    //option 2
    public String listAllGames(){
        String result = "";
        for(Game g : games){
            result += g.toString() + "\n";
        }
        return result;
    }
    
    //option 3
    public String sortGames(String sortBy, String sortInfo){
        String result = "";
        
        switch(sortBy){
            case "tag":
                
                for(Game g : games){
                    if(g.tags.contains(GameTag.valueOf(sortInfo))){
                        result += g.toString() + "\n";
                    }
                }
                
                break;
            case "plat":
                
                break;
            
        }
        
        
        return result;
    }
    
    //option 4
    
    public String topRatedGames(int count){
        String result = "";
        
        ArrayList<Game> copy = new ArrayList<>(games);
        
        for (int i = 0; i < count; i++){
            int maxR = 0;
            int maxInd = 0;
            int j = 0;
            
            for(Game g : copy){
                if(maxR < g.getRating()){
                    maxR = g.getRating();
                    maxInd = j;
                }
                
                j++;
            }
            
            result += games.get(maxInd).toString() + "\n";
            copy.remove(maxInd);
        }
        
        return result;
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
