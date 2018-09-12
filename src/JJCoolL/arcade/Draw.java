package JJCoolL.arcade;

import java.util.Stack;

public class Draw {

    private static Stack<Card> draw;

/**
 * Constructor for objects of class Deck
 * Instantiates a new deck object and assignes cards into deck object
 */
public Draw()
        {
        draw=new Stack<>();
        for(Colour currentColour:Colour.values()){
        for(int i=1;i<=9;i++){
        Card newCard=new Card(i,currentColour);
        draw.push(newCard);
        Card newCardTwo=new Card(i,currentColour);
        draw.push(newCardTwo);
        }
        for(int j=0;j< 1;j++){
        Card newCardZero=new Card(j,currentColour);
        draw.push(newCardZero);
        }
        }
        }

public int getLength(){
        return draw.size();
        }
        // // Write the method for this class below this line
        public int pop(){
         return 0;
        }

        public int peek(){
        return 0;
         }

         public void clear(){

         }
        }



