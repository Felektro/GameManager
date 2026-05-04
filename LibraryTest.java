

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LibraryTest.
 *
 * @author  Illia
 * @version (a version number or a date)
 */
public class LibraryTest
{
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testAddGame()
    {
        Game game1 = new Game("game", 'E', 5.5f, 2);
        Library library1 = new Library();
        int size = library1.games.size();
        
        library1.addGame(game1);
        
        assertEquals(size + 1, library1.games.size());
    }
    
    @Test
    public void testRemoveGame()
    {
        Game game1 = new Game("game", 'E', 5.5f, 2);
        Library library1 = new Library();
        int size = library1.games.size();
        
        library1.addGame(game1);
        size = library1.games.size();
        
        library1.removeGame(game1);
        
        assertEquals(size - 1, library1.games.size());
    }
}
