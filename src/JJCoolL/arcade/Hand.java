package JJCoolL.arcade;

import JJCoolL.arcade.Exceptions.NoCardInPositionException;

import java.util.ArrayList;

/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand
{
    // define instance variables here
    public ArrayList <Card> hand;

    /**
 * Constructor for objects of class Hand
 */
    public Hand()
    {
        // write code to initialise instance variables
        this.hand = new ArrayList<>(7);

    }

    public int numberOfCards(){
        return hand.size();
    }
    // Write the method for this class below this line

    public void addCard(Card card){
        this.hand.add(card);
    }

    public void removeCard(int position) throws NoCardInPositionException {
        if(position < 0) {
            throw new NoCardInPositionException("no card at this position");
        }
        if (position < numberOfCards()) {
            throw new NoCardInPositionException("no card at this position");

        }else{
            this.hand.remove(position);

        }
    }

    public ArrayList<Card> Hand(){
        return hand;
    }
}
//  The code for the class Hand ends with the bracket on the line above.
//  Nothing should be written below here

/*


public void printHand();

*/
