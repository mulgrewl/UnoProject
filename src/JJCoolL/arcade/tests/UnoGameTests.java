package JJCoolL.arcade.tests;

import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;
import JJCoolL.arcade.Player;
import JJCoolL.arcade.UnoGame;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;

public class UnoGameTests {

    private Player player;
    private UnoGame unoGame;

    public UnoGameTests(){

    }

    @Before
    public void setUp()
    {
        unoGame = new UnoGame();
        player = new Player("");

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
    public void testRemovePlayer(){


    }

    @Test
    public void GetPlayersCards(){


    }
}
//Awaiting update from Jardel