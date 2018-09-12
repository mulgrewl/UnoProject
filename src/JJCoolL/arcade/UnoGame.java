package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class UnoGame  {

    String gameName; //removed parameters from here JTK & moved from constructor to field
    String gameState; //added a gameState
    int balance; //moved from constructor to field
    Deck draw; //creating a new deck
    Deck discard;
    private ArrayList<Player> playerList;



    public UnoGame() {

        draw = new Deck();
        discard = new Deck();
        this.playerList = new ArrayList<>(10);

        // pop 7 from stack - get player.length, for every player, pop 7 to player.hand
        //pop 1 card to discard stack

    }

    void startGame() throws InvalidNumberOfPlayersException {

    }
    UnoGame unoGame = new UnoGame();

    String getGameName(){
        return gameName;// i added a return for this method JTK
    }

    int getBalance(){
        return balance;
    }    // i added a get balance method JTK

    public void insertCoin() {
        ++balance;
    }





    String getGameState(){
        return gameState;
    }

    void startRound() {
        Collections.shuffle(deck);
        {
            Iterator it = playerList.iterator();
            while (it.hasNext())
                for (int i = 0; i < 7; i++) {
                    i = Deck.draw.pop();
                    Deck.hand.add(i);
                }
        }
        discard.push(Deck.draw.pop());
    }


    // String sendCommand(Command command) throws InvalidCommandException{

    // }

    void addPlayer(String name) throws InvalidNumberOfPlayersException {
        if (balance < 2) {
            throw new InvalidNumberOfPlayersException(); // needs changing
        } else {
            Player player = new Player(name);
            this.playerList.add(player); // adds all players of UnoGame by name JT
        }
    }


    void removePlayer(Player player) {
        this.playerList.remove(player); // removes player by name JT
    }

    List<Player> getPlayers(){
        return this.playerList; // Lists all players of game - JT
    }

    // String getScoreboard(){

    // }

    //String getHelp();

    // List<Deck> seeHand(currentPlayer) {
    // List<Deck> hand = new ArrayList<Deck>();


    // void playCard ( int x, String y );

    // void passCard ();

    // Player currentPlayer (Player new player);

    // Player nextPlayer (currentPlayer);

    // int getPlayerHandSize (Player hand);

    // String winGame ();


    // }

    void endGame(){

    }

}