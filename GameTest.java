

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GameTest.
 *
 * @author  Illia
 * @version (a version number or a date)
 */
public class GameTest
{
    /**
     * Default constructor for test class GameTest
     */
    public GameTest()
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
    public void testConstructor()
    {
        Game game1 = new Game("test_game", 'E', 5.5f, 2);
        assertEquals("test_game", game1.getGameName());
        assertEquals('E', game1.getAgeRate());
        assertEquals(5.5f, game1.getRating());
        assertEquals(2, game1.getID());
    }
    
    @Test
    public void testEquals(){
        Game game1 = new Game("test_game1", 'E', 5.5f, 2);
        Game game2 = new Game("test_game2", 'T', 5.6f, 2);
        Game game3 = new Game("test_game3", 'A', 5.6f, 3);
        
        assertTrue(game1.equals(game1));
        assertFalse(game1.equals(null));
        assertFalse(game1.equals(new Library()));
        assertTrue(game1.equals(game2));
        assertFalse(game1.equals(game3));
        
    }
}

