package JJCoolL.arcade;

import JJCoolL.arcade.Exceptions.NoCardInPositionException;

import java.util.ArrayList;

/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand {
    // define instance variables here
    private ArrayList<Card> hand;
    private Card card;

    /**
     * Constructor for objects of class Hand
     */
    public Hand() {
        // write code to initialise instance variables
        this.hand = new ArrayList<>(7);

    }

    public int numberOfCards() {
        return hand.size();
    }
    // Write the method for this class below this line

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public Card removeCard(Card selectedCard) throws NoCardInPositionException {
        int position = hand.indexOf(selectedCard);


        if (position < 0) {
            throw new NoCardInPositionException("no card at this position");
        }
        if (position > numberOfCards()) {
            throw new NoCardInPositionException("no card at this position");

        } else {

           Card newPosition = this.hand.remove(position);
            return newPosition;


        }
    }
  //  public int getCardAtPosition(Card otherCard){
     // int selectedCard =  hand.get(Card otherCard);

     //   return selectedCard;
//}
   /* public Colour getColourOfRemovedCard() {
        Card card;
        Colour colourOfRemovedCard = removeCard(position).getColour();
        return colourOfRemovedCard;

    }

    public int getNumberOfRemovedCard() {
        int numberOfRemovedCard = removeCard(int position).getNumber();
        return numberOfRemovedCard;

    }*/

    public ArrayList<Card> Hand() {
        return hand;
    }
}
//  The code for the class Hand ends with the bracket on the line above.
//  Nothing should be written below here

/*


public void printHand();

*/
