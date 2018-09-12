package JJCoolL.arcade.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import JJCoolL.arcade.Draw;

import static org.junit.Assert.assertEquals;

public class DrawTest {
private Draw draw;
    /**
     * Default constructor for test class DeckTest
     */
    public DrawTest()
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
     //   Draw draw = new Draw();
        //Test length of deck - JT
        int expectedLength = 76;
        int actualLength = draw.getLength();
        assertEquals(expectedLength, actualLength);
    }


}
