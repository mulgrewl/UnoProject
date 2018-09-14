package JJCoolL.arcade;

import java.util.Stack;

/**
 * This class will create and hold the discard pile ( or the play pile) which will enable the game to check if the card
 * the player selects to play matches the top card of  the discard pile. LM
 */
public class Discard {
    private static Stack<Card> discard;
    private Card card;

    public Discard() {

        this.discard = new Stack<>();
    }

    /**
     * this method will enable will the draw pile to add the first card to the discard pile to start play LM
     *
     * @param card
     */
    public void addCard(Card card) {
        discard.push(card);
    }

    /**
     *this method will enable the hand to add the card removed from the hand to the discard pile (to play the card)
     * LM
     * @param removedCard
     */
    public Card playCardFromHand(Card removedCard) {
        discard.push(removedCard);
        return removedCard;

    }

    /**
     * this method will enable the Player class to see the topCard on the discard pile - the card that is currently in play. LM
     *
     * @return
     */
    public Card peakAtCard() {
        Card topCard = discard.peek();

        return topCard;
    }

    public Colour getColourOfTopCard() {
        Colour colourOfTopCard = peakAtCard().getColour();
    return colourOfTopCard;
    }
    public int getNumberOfTopCard() {
        int numberOfTopCard = peakAtCard().getNumber();
        return numberOfTopCard;
    }
}

