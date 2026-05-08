import java.util.Scanner;


/**
 * Here you could interact with the scanner! To find easily your library details, the list of games; by genre or by platform,
 * list top rated games, print details, rate a game, start a session and print sesssion. You can also add your own game!
 *
 * @author (Illia)
 * @version (5/7/2026)
 */
public class Main
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Main
     */
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Library lib = new Library();
        
        boolean isOpen = true;
        
        while(isOpen){
            System.out.println("Hello, please pick an option 1-10 \n" +
                                "1. Print library details\n" + 
                                "2. List all games\n" + 
                                "3. List games by genre or platform\n" + 
                                "4. List top-rated games\n" + 
                                "5. Print game details\n" + 
                                "6. Rate a game\n" + 
                                "7. Start a game session\n" + 
                                "8. Print game session log\n" + 
                                "9. Add your own game\n" + 
                                "0. EXIT\n");
            
            int option = 10;
            try{
                 option = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Not an option");
            }
            
            switch(option){
                case 1: 
                    System.out.println(lib.libDetails());
                    break;
                case 2: 
                    System.out.println(lib.listAllGames());
                    break;
                case 3: 
                    System.out.println("Hello, please pick genre (1) or platform (2)");
                    int o = 3;
                    try{
                         o = Integer.parseInt(sc.nextLine());
                    }catch (Exception e){
                        System.out.println("Not an option");
                    }
                    switch(o){
                        case 1: 
                            System.out.println("What tag do you want to sort by?");
                            for(GameTag t: GameTag.values()){
                                System.out.print(t + " ");
                            }
                            
                            System.out.println("\n" + lib.sortGames("tag", sc.nextLine()));
                            break;
                        case 2: 
                            System.out.println("What platform do you want to sort by?");
                            for(Platform p: Platform.values()){
                                System.out.print(p + " ");
                            }
                            
                            System.out.println("\n" + lib.sortGames("plat", sc.nextLine()));
                            break;
                        default:
                            System.out.println("Not an option");
                            break;
                        }
                    break;
                case 4: 
                    o = 1;
                    System.out.println("How many top rated games do you want to see?");
                    try{
                         o = Integer.parseInt(sc.nextLine());
                    }catch (Exception e){
                        System.out.println("Not an option");
                    }
                    
                    System.out.println(lib.topRatedGames(o));
                    break;
                case 5: 
                    System.out.println("What game do you want to search for?");
                    Game foundGame = lib.searchByName(sc.nextLine());
                    System.out.println(foundGame != null ? foundGame.toString() : "No game found");
                    break;
                case 6: 
                    System.out.println("What game do you want to rate? \n ");
                    foundGame = lib.searchByName(sc.nextLine());

                    float opt = 1;
                    System.out.println("What do you rate it? (0-10)");
                    try{
                         opt = Float.parseFloat(sc.nextLine());
                    }catch (Exception e){
                        System.out.println("Not an option");
                    }
                    if(foundGame != null){
                        foundGame.setRating(opt);
                    }
                    else{
                        System.out.println("No game found");
                    }
                    System.out.println();

                    break;
                case 7: 
                    System.out.println("What game do you want to play?");
                    foundGame = lib.searchByName(sc.nextLine());
                    if(foundGame != null){
                        lib.startGameSession(foundGame);
                    }
                    else{
                        System.out.println("No game found");
                    }
                    break;
                case 8: 
                    //
                    break;
                case 9: 
                    System.out.println("Whats the name of the game you want to add?");
                    String name = sc.nextLine();

                    System.out.println("Whats the age rating of the game? (E, T, M)");
                    char ageRate = sc.nextLine().charAt(0);
                    
                    System.out.println("Whats your rating of the game? (0-10)");
                    float rating = Float.parseFloat(sc.nextLine());

                    Game newGame = new Game(name, ageRate, rating, 0);

                    lib.addGame(newGame);
                    
                    boolean pickingPlatform = true;

                    while(pickingPlatform){
                        System.out.println("What platform is it on? \nType 'done' when finished");
                        for(Platform p: Platform.values()){
                            System.out.print(p + " ");
                        }
                        String input = sc.nextLine();
                        try{
                            newGame.addPlatform(Platform.valueOf(input));
                        }catch(Exception e){
                            if (input.equalsIgnoreCase("done")) {
                                pickingPlatform = false;
                            }
                            System.out.println("Not an option");
                        }
                    }

                    boolean pickingTags = true;

                    while(pickingTags){
                        System.out.println("What tags does it have? \n Type 'done' when finished");
                        for(GameTag t: GameTag.values()){
                            System.out.print(t + " ");
                        }
                        String input = sc.nextLine();
                        try{
                            newGame.addGameTag(GameTag.valueOf(input));
                        }catch(Exception e){
                            if (input.equalsIgnoreCase("done")) {
                                pickingTags = false;
                                break;
                            }
                            System.out.println("Not an option");
                            break;
                        }
                    }
                
                    break;

                case 0: 
                    System.out.println("Cya next time!");
                    isOpen = false;
                    break;
                default:
                    System.out.println("Not an option");
                    break;
            }
        }
        
    }
}
