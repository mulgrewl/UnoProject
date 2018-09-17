package JJCoolL.arcade.tests;

import JJCoolL.arcade.*;
import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;

public class UnoGameTests {

    private Player player;
    private UnoGame unoGame;
    private Discard discard;
    private Card card;
    private Card card2;
    private Card card3;

    public UnoGameTests() {

    }

    @Before
    public void setUp() {
        unoGame = new UnoGame();
        player = new Player("");
        discard = new Discard();
        card = new Card(9, Colour.YELLOW);
        card2 = new Card(8, Colour.YELLOW);
        card3 = new Card(7, Colour.YELLOW);



    }

    @Test
    public void testAddPlayer() throws NoCardInPositionException, InsufficientFundsException {
        unoGame.addPlayer("Joe");


        int expectedSize = 1;
        int actualSize = unoGame.getNumberOfPlayers();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testMultiplePlayers() throws NoCardInPositionException, InsufficientFundsException {
        unoGame.addPlayer("Joe");
        unoGame.addPlayer("Trevor");

        int expectedSize = 2;
        int actualSize = unoGame.getNumberOfPlayers();
        assertEquals(expectedSize, actualSize);

    }

    @Test
    public void testRemovePlayer() {


    }

    @Test
    public void GetPlayersCards() {


    }

    @Test
    public void playSelectedCard() throws InvalidMoveException, NoCardInPositionException {
        discard.addCard(card2);
        //draw.takeTopCard());
        unoGame.playSelectedCard(card);
        int expectedSize = 2;
        int actualSize = player.getHand().numberOfCards();
        Assert.assertEquals(expectedSize, actualSize);
    }
}
//Awaiting update from Jardel