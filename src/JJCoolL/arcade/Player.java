package JJCoolL.arcade;

public class Player {

    private Hand hand;
    private String name;
    // private Discard discard;
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

    public Card playSelectedCard(Card removedCard) {
        Card selectedCard = discard.playCardFromHand(removedCard);
        return selectedCard;
    }
}

// public static void createPlayer() {




  /* void CatchUno() {
    }

    void CallsUno() {
    }



*/
