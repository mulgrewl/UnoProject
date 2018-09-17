package JJCoolL.arcade.tests;

import JJCoolL.arcade.*;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Hand hand;
    private Card card;
    private Card card2;
    private Card card3;
    private Player player;
    private Discard discard;
    private Draw draw;

    /**
     * Default constructor for test class TestPlayer
     */
    public PlayerTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */

    @Before
    public void setUp() {
        draw = new Draw();
        //discard = new Discard();


        player = new Player("Joe");



        card = new Card(9, Colour.YELLOW);
        card2 = new Card(8, Colour.YELLOW);
        card3 = new Card(7, Colour.YELLOW);
        player.discard.addCard(card2);


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
    public void testEmptyHand() {
        // player = new Player("Joe");

        int expectedSize = 0;
        int actualSize = player.getHand().numberOfCards();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testHand() {
        // player = new Player("Joe");

        player.getHand().addCard(card);
        player.getHand().addCard(card2);

        int expectedSizes = 2;
        int actualSizes = player.getHand().numberOfCards();

        assertEquals(expectedSizes, actualSizes);
    }

    @Test
    public void playSelectedCard() throws InvalidMoveException, NoCardInPositionException {
        discard.addCard(card2);
      //draw.takeTopCard());
        player.playSelectedCard(card);
        int expectedSize = 2;
        int actualSize = player.getHand().numberOfCards();
        assertEquals(expectedSize, actualSize);

    }
}

