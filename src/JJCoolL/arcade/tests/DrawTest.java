package JJCoolL.arcade.tests;

import JJCoolL.arcade.Card;
import JJCoolL.arcade.Player;
import JJCoolL.arcade.UnoGame;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import JJCoolL.arcade.Draw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class DrawTest {
    private Draw draw;
    private Player player;
    private UnoGame unoGame;

    /**
     * Default constructor for test class DeckTest
     */
    public DrawTest() {
     //   unoGame = new UnoGame();

    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */

    @Before
    public void setUp() {
        draw = new Draw();
        player = new Player("Joe");
        player = new Player("Lucy");
    }

    /**
     * Tears down the test fixture.
     * <p>
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    @Test
    public void testNewDeckLength() {
        //Creates new deck object - JT
        //   Draw draw = new Draw();
        //Test length of deck - JT
        int expectedLength = 76;
        int actualLength = draw.getLength();
        assertEquals(expectedLength, actualLength);
    }
@Test
    public void testShuffle() {

        Card card = draw.takeTopCard();
        Card card1 = draw.takeTopCard();
        assertTrue (card != card1);


    }




}
