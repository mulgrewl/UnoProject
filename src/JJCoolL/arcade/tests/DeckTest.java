package JJCoolL.arcade.tests;

import java.util.Stack;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

import JJCoolL.arcade.Deck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {

    /**
     * Default constructor for test class DeckTest
     */
    public DeckTest()
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
    public void testNewDeckLength()
    {
        //Creates new deck object - JT
        Deck deck = new Deck();
        //Test length of deck - JT
        int expectedLength = 76;
        int actualLength = deck.getLength();
        assertEquals(expectedLength, actualLength);
    }


}
