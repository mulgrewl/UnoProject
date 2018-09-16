package JJCoolL.arcade.tests;

import JJCoolL.arcade.Card;
import JJCoolL.arcade.Colour;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;
import JJCoolL.arcade.Hand;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class HandTest {
    private Hand hand;
    private Card card;
    private Card card2;
    private Card card3;


    public HandTest() {
    }

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        card = new Card(9, Colour.YELLOW);
        card2 = new Card(8, Colour.YELLOW);
        card3 = new Card(7, Colour.YELLOW);
        hand = new Hand();
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
    public void checkNewHand() {
        int expectedSize = 0;
        int actualSize = hand.numberOfCards();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void addCardToHand() {
        hand.addCard(card);

        int expectedSize = 1;
        int actualSize = hand.numberOfCards();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void addMultipleCardsToHand() {
        hand.addCard(card);
        assertEquals(1, hand.numberOfCards());

        hand.addCard(card2);
        assertEquals(2, hand.numberOfCards());

        hand.addCard(card3);
        assertEquals(3, hand.numberOfCards());
    }

    @Test
    public void removeCard() throws NoCardInPositionException {
        hand.addCard(card);
        hand.addCard(card2);
        hand.addCard(card3);

        assertEquals(3, hand.numberOfCards());

        hand.removeCard(card);
        assertEquals(2, hand.numberOfCards());

        hand.removeCard(card2);
        assertEquals(1, hand.numberOfCards());

        hand.removeCard(card3);
        assertEquals(0, hand.numberOfCards());
    }
}

 /* @Test
    public void removeCardFromEmptySlot() throws NoCardInPositionException{
     hand.addCard(card);
      hand.addCard(card2);

        assertEquals(2, hand.numberOfCards());

       hand.removeCard(5);
        assertEquals(2, hand.numberOfCards());
    }*/

    //@Test
   // public void positionTooSmall()throws NoCardInPositionException{
    //    boolean isThrown;
//        isThrown = false;
//        try{
//            hand.removeCard(-1);
//        }
//        catch(NoCardInPositionException e)
//        {isThrown = true;
//        }
//        assertTrue (isThrown);
//
//    }
   // @Test
    /*public void positionNotInHand() throws NoCardInPositionException{
        boolean isThrown;
        isThrown = false;
        hand.addCard(card);
        hand.addCard(card2);
        assertEquals (2, hand.numberOfCards());
        try{
            hand.removeCard(4);
        }
        catch(NoCardInPositionException e)
        {isThrown = true;

        }
        assertTrue (isThrown);

    }*/


//Updated

