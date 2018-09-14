package JJCoolL.arcade;

/**
 * The class Card will hold the variables of cardNumber and cardColour.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    private int cardNumber;
    private Colour cardColour;

    public Card(int cardNumber , Colour cardColour) {
        this.cardNumber = cardNumber;
        this.cardColour = cardColour;
    }
    public Colour getColour(){
     return this.cardColour;
    }
    public int getNumber(){
        return this.cardNumber;
    }

}

//No Updated Needed