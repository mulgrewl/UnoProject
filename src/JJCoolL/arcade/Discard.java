package JJCoolL.arcade;

import java.util.Stack;

public class Discard {
    private static Stack<Card> discard;

    public Discard() {

        this.discard = new Stack<>();
    }

    public void addCard(Card card) {
        discard.push(card);


    }
}
