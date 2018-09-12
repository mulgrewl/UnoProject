package JJCoolL.arcade.tests;

import JJCoolL.arcade.Card;
import JJCoolL.arcade.Colour;
import JJCoolL.arcade.Hand;

import static org.junit.Assert.*;

import JJCoolL.arcade.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Hand hand;
    private Card card;
    private Card card2;
    private Card card3;
    private Player player;

    /**
     * Default constructor for test class TestPlayer
     */
    public PlayerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */

    @Before
    public void setUp()
    {
        player = new Player("Joe");

        card = new Card(9, Colour.YELLOW);
        card2 = new Card(8, Colour.YELLOW);
        card3 = new Card(7, Colour.YELLOW);

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testEmptyHand()
    {
        player = new Player("Joe");

        int expectedSize = 0;
        int actualSize = player.getHand().numberOfCards();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testHand(){
        player = new Player("Joe");

        player.getHand().addCard(card);
        player.getHand().addCard(card2);

        int expectedSizes = 2;
        int actualSizes = player.getHand().numberOfCards();

        assertEquals(expectedSizes, actualSizes);
    }

}
