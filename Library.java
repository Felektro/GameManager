import java.util.ArrayList;
import java.util.Scanner;

/**
 * Welcome to the library! This is where you can store your games! Print their details, sort them out, 
 * find the top rated and more!
 *
 * @author (Illia)
 * @version (5/7/2026)
 */

public class Library
{
    public ArrayList <Game> games;
    
    double startPlaytime = 0.0;

    int nextID = 10;
    
    Game lastGame = null;

    public Library()
    {
        games = new ArrayList<>();
        
        Game game1 = new Game("Elden Ring", 'M', 9.7f, 1);
        game1.addGameTag(GameTag.ADVENTURE);
        game1.addPlatform(Platform.PC);
        addGame(game1);
        
        Game game2 = new Game("Hades", 'T', 9.1f, 2);
        game2.addGameTag(GameTag.INDIE);
        game2.addPlatform(Platform.SWITCH);
        addGame(game2);
        
        Game game3 = new Game("Civilization VI", 'E', 8.8f, 3);
        game3.addGameTag(GameTag.STRATEGY);
        game3.addPlatform(Platform.PS4);
        addGame(game3);

        SinglePlayer sp1 = new SinglePlayer("The Witcher 3", 'M', 9.8f, 4);
        sp1.addGameTag(GameTag.AAA);
        sp1.addPlatform(Platform.PC);
        addGame(sp1);
        
        SinglePlayer sp2 = new SinglePlayer("Celeste", 'E', 9.0f, 5);
        sp2.addGameTag(GameTag.INDIE);
        sp2.addPlatform(Platform.SWITCH);
        addGame(sp2);
        
        SinglePlayer sp3 = new SinglePlayer("God of War", 'M', 9.6f, 6);
        sp3.addGameTag(GameTag.ADVENTURE);
        sp3.addPlatform(Platform.PS4);
        addGame(sp3);
        
        MultiPlayer mp1 = new MultiPlayer("Fortnite", 'T', 8.5f, 7);
        mp1.addGameTag(GameTag.F2P);
        mp1.addPlatform(Platform.PC);
        mp1.setMaxPlayers(100);
        addGame(mp1);
        
        MultiPlayer mp2 = new MultiPlayer("Minecraft", 'E', 9.5f, 8);
        mp2.addGameTag(GameTag.TWOD);
        mp2.addPlatform(Platform.MOBILE);
        mp2.setMaxPlayers(8);
        addGame(mp2);
        
        MultiPlayer mp3 = new MultiPlayer("Call of Duty", 'M', 8.9f, 9);
        mp3.addGameTag(GameTag.AAA);
        mp3.addPlatform(Platform.XBOX);
        mp3.setMaxPlayers(16);
        addGame(mp3);
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
    /**
     * Returns a string of top rated games 
     */
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
            
            result += copy.get(maxInd).toString() + "\n";
            copy.remove(maxInd);
        }
        
        return result;
    }

    //option 5
    /**
     * Returns the game you're looking for 
     */
    public Game searchByName(String name){
        for(Game g : games){
            if(g.getName().toLowerCase().contains(name.toLowerCase())){
                return g;
            }
        }
        return null;
    }

    //option 7
    /**
     * Starts a make believe game session that tracks your time "played"
     */
    public void startGameSession(Game game){
        System.out.println("Starting " + game.getName() + "...");
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
            
        }

        game.playtime += playtime;
        lastGame = game;
    }
    
    /**
     * Add a game to the library
     */
    public void addGame(Game game)
    {
        game.setID(nextID++);
        games.add(game);
    }
    
    /**
     * remove game from library
     */
    public void removeGame(Game game)
    {
        games.remove(game);
    }
    
    /**
     * Prints all games in the library
     */
    public void printAllGames()
    {
        for(Game g: games){
            System.out.println(g);
        }
    }
}
