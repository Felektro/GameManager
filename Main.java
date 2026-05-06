import java.util.Scanner;


/**
 * Write a description of class Main here.
 *
 * @author Illia
 * @version (a version number or a date)
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
            System.out.println("Hello, please pick an option 1-10");
            
            int option = 10;
            try{
                 option = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Thats not an option");
            }
            
            switch(option){
                case 1: 
                    System.out.println(lib.libDetails());
                    break;
                case 2: 
                    System.out.println(lib.listAllGames());
                    break;
                case 3: 
                    System.out.println("Hello, please pick an option 1 or 2");
                    int o = 3;
                    try{
                         o = Integer.parseInt(sc.nextLine());
                    }catch (Exception e){
                        System.out.println("Thats not an option");
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
                    o = 3;
                    System.out.println("How many top rated games do you want to see?");
                    try{
                         o = Integer.parseInt(sc.nextLine());
                    }catch (Exception e){
                        System.out.println("Thats not an option");
                    }
                    
                    System.out.println(lib.topRatedGames(o));
                    break;
                case 5: 
                    //
                    break;
                case 6: 
                    //
                    break;
                case 7: 
                    //
                    break;
                case 8: 
                    //
                    break;
                case 9: 
                    //
                    break;
                case 0: 
                    System.out.println("Cya next time!");
                    isOpen = false;
                    break;
                default:
                    System.out.println("Thats not an option");
                    break;
            }
        }
        
    }
}
