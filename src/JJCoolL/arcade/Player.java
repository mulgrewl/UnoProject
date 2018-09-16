
package JJCoolL.arcade;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;

/**
 * the Player class will create a new player whenever the constructor is called, this player will have a
 * new hand and a name LM
 *
 */
public class Player {

    private Hand hand;
    private String name;
    private Discard topCard;
    private Discard discard;


    public Player(String name) {
        this.name = name;
        this.hand = new Hand();

    }

    public String getName() {
        return this.name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public Discard seeTopCard(Discard topCard) {

        Discard newTopCard = this.topCard;
        return newTopCard;
    }

    public Card playSelectedCard(Card card) throws InvalidMoveException, NoCardInPositionException {


        if (discard.canCardBePlayed(card) == true) {
            //get cards position then
            hand.removeCard(card).discard.addCard(card) ;

        }
        return null;

    }


    }

// public static void createPlayer() {




  /* void CatchUno() {
    }

    void CallsUno() {
    }



*/
