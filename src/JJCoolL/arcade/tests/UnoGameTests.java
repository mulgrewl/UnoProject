package JJCoolL.arcade.tests;

import JJCoolL.arcade.Player;
import org.junit.Before;
import org.junit.Test;

public class UnoGameTests {

    Player player;

    @Before
    public void setUp() {
       // game = new UnoGame();
    }

    @Test
    public void testAddPlayer() {
        player = new Player("Joe");


    }
}
