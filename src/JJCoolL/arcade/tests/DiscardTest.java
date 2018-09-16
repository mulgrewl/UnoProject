package JJCoolL.arcade.tests;

import JJCoolL.arcade.*;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiscardTest {
    private Discard discard;


    /**
     * Default constructor for test class DeckTest
     */
    public DiscardTest() {
        //   unoGame = new UnoGame();


    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */

    @Before
    public void setUp() {
        discard = new Discard();
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
    public void testCanCardWithSameNumberBePlayed() throws InvalidMoveException {
        Card card = new Card(5, Colour.RED);
        Card card2 = new Card(5, Colour.BLUE);

        discard.addCard(card);
        boolean canBePlayed = discard.canCardBePlayed(card2);
        assertTrue(canBePlayed);

    }

    @Test
    public void testCanCardWithSameColourBePlayed() throws InvalidMoveException {
        Card card = new Card(1, Colour.BLUE);
        Card card2 = new Card (2, Colour.BLUE);

        discard.addCard(card);
        boolean canBePlayed = discard.canCardBePlayed(card2);
        assertTrue(canBePlayed);

    }
    @Test
    public void testCardCannotBePlayed() throws InvalidMoveException {
        Card card = new Card(1, Colour.BLUE);
        Card card2 = new Card ( 2, Colour.RED);

        discard.addCard(card);
        boolean canBePlayed = discard.canCardBePlayed(card2);
        assertFalse(canBePlayed);


        }

    }






