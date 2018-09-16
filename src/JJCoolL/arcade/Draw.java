package JJCoolL.arcade;

import java.util.Stack;
import java.util.Collections;

public class Draw {
    private static Stack<Card> draw;

    /**
     * Constructor for objects of class Deck
     * Instantiates a new deck object and assignes cards into deck object to create the Uno deck.
     */
    public Draw() {
        this.draw = new Stack<>();
        for (Colour currentColour : Colour.values()) {
            for (int i = 1; i <= 9; i++) {
                Card newCard = new Card(i, currentColour);
                draw.push(newCard);
                Card newCardTwo = new Card(i, currentColour);
                draw.push(newCardTwo);
            }
            for (int j = 0; j < 1; j++) {
                Card newCardZero = new Card(j, currentColour);
                draw.push(newCardZero);
            }
        }
        Collections.shuffle(draw);
     //   draw = draw.shuffleCards();
    }

    /**
     * the getLength method
     * @return draw.size()
     */
    public int getLength() {
        return draw.size();
    }

    public Card takeTopCard() {
        Card card = draw.pop();
        return card;
    }

    public void shuffleCards() {
         Collections.shuffle(draw);
        //return shuffledDrawDeck;
    }


}

// // Write the method for this class below this line




