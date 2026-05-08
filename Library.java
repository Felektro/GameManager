import java.util.ArrayList;
import java.util.Scanner;

/**
 * Welcome to the library! This is where you can store your games! Print their details, sort them out, 
 * find the top rated and more!
 *
 * @author Illia
 * @version (5/7/2026)
 */

public class Library
{
    public ArrayList <Game> games;
    
    double startPlaytime = 0.0;

    int nextID = 6;

    public Library()
    {
        games = new ArrayList<>();
        
        addGame(new Game("test_game1", 'E', 5.5f, 1));
        addGame(new Game("test_game2", 'T', 5.6f, 2));
        addGame(new Game("test_game3", 'A', 5.7f, 3));
        addGame(new Game("test_game2", 'T', 5.8f, 4));
        addGame(new Game("test_game3", 'A', 5.9f, 5));
        addGame(new SinglePlayer("test_SinglePlayer", 'A', 5.9f, 3));
        addGame(new MultiPlayer("test_MultiPlayer", 'A', 5.9f, 3));
        ((MultiPlayer) games.get(games.size() - 1)).setMaxPlayers(4);
        
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
    /**
     * Returns a string of the library details
    */
    public String libDetails(){
        return "This library contains " + games.size() + " games!";
    }
    
    //option 2
    /**
     * Returns a string of all the listed games
     */
    public String listAllGames(){
        String result = "";
        for(Game g : games){
            result += g.toString() + "\n";
        }
        return result;
    }
    
    //option 3
    /**
     * Returns a string of games by sorting them; by gametag or platform. 
     */
    public String sortGames(String sortBy, String sortInfo){
        String result = "";
        
        switch(sortBy){
            case "tag":
                
                for(Game g : games){
                    try{
                            if(g.tags.contains(GameTag.valueOf(sortInfo))){
                                result += g.toString() + "\n";
                            }
                    }
                    catch(Exception e){
                        System.out.println("Not an option");
                        break;
                    }
                }
                break;
            case "plat":
                for(Game g : games){
                    try{
                        if(g.platforms.contains(Platform.valueOf(sortInfo))){
                            result += g.toString() + "\n";
                        }
                    }
                    catch(Exception e){
                        System.out.println("Not an option");
                        break;
                    }
                }
                break;
        }
        return result;
    }
    
    //option 4
    
    public String topRatedGames(int count){
        if(count > games.size()){
            count = games.size();
        }
        
        String result = "";
        
        ArrayList<Game> copy = new ArrayList<>(games);
        
        for (int i = 0; i < count; i++){
            float maxR = 0;
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

    //option 5
    public Game searchByName(String name){
        for(Game g : games){
            if(g.getGameName().toLowerCase().contains(name.toLowerCase())){
                return g;
            }
        }
        return null;
    }

    //option 7

    public void startGameSession(Game game){
        System.out.println("Starting " + game.getGameName() + "...");
        if(game instanceof SinglePlayer){
            System.out.println("Enjoy your single player experience!");
        }
        else if(game instanceof MultiPlayer){
            System.out.println("Enjoy your multiplayer experience! \nFor best experience, play with " + ((MultiPlayer) game).getMaxPlayers() + " friends!");
        }

        startPlaytime = System.currentTimeMillis();
        boolean exit = false;

        Scanner sc = new Scanner(System.in);

        //System.out.println("Type 'exit' to end the session.");

        double playtime = 0;

        while (!exit) {
            if(sc.nextLine().equalsIgnoreCase("exit")){
                exit = true;
                System.out.println("Thanks for playing! Your playtime is now " + playtime + " seconds.");
            }else{
                
                System.out.println("Youve been playing for " + playtime + " seconds. Type 'exit' to end the session.");
            }
            playtime = (System.currentTimeMillis() - startPlaytime) / 1000.0f;
            game.playtime += playtime;
        }

    }

    public void addGame(Game game)
    {
        game.setID(nextID++);
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
