package JJCoolL.arcade;

import JJCoolL.arcade.Exceptions.InvalidMoveException;

import java.util.Stack;

/**
 * This class will create and hold the discard pile ( or the play pile) which will enable the game to check if the card
 * the player selects to play matches the top card of  the discard pile. LM
 */
public class Discard {
    private static Stack<Card> discard;
    private Card card;
   // private Hand hand;

    public Discard() {

        discard = new Stack<>();
    }

    /**
     * this method will enable will the draw pile to add the first card to the discard pile to start play LM
     *
     * @param //card
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
     * this method can be used to peak at the top of the stack (discard pile) and see the current card in play.
     * This allows the canCardBePlayed method to see the topCard on the discard pile and compare this with the card the player has selected to play. LM
     *
     * @return topCard
     * @see #canCardBePlayed
     */
    public Card peakAtCard() {
        Card topCard = discard.peek();

        return topCard;
    }

    /** this method enables the Discard class to view the colour value of the given Card
     *
     * @return colourOfTopCard
     * @see #canCardBePlayed(Card)
     */
    public Colour getColourOfTopCard() {
        Colour colourOfTopCard = peakAtCard().getColour();
        return colourOfTopCard;
    }

    /**
     * this method enables the Discard class to view the number value of the given Card
     * @return numberOfTopCard
     * @see #canCardBePlayed(Card)
     */
    public int getNumberOfTopCard() {
        int numberOfTopCard = peakAtCard().getNumber();
        return numberOfTopCard;
    }

    /**
     * this method enables the Discard Class to see if the card selected by the player can be played.
     * The method first uses the peakAtCard method to see the top card of the Stack discard.
     * It checks to see if the the colour values of the two cards to see if they match, if this is the case it returns true - as the card can be played
     * It then checks to see if the number values of the two cards match and returns true if this is the case.
     * if neither of the above values match the method throws a new InvalidMoveException, as the card can not be played
     * and the player needs to be informed of this.
     *
     * @param otherCard
     * @return boolean
     * @throws InvalidMoveException
     */
    public boolean canCardBePlayed(Card otherCard) throws InvalidMoveException {
        Card topCard = peakAtCard();
        //Card cardAtPosition = hand.getCardAtPosition(otherCard);
        if (topCard.getColour() == otherCard.getColour()) {
            return true;
        } else if (topCard.getNumber() == otherCard.getNumber()) {
            return true;
        } else {
            throw new InvalidMoveException();

        }
    }
}

