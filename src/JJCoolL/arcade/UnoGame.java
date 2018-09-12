package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnoGame  {

    String gameName; //removed parameters from here JTK & moved from constructor to field
    String gameState; //added a gameState
    int balance; //moved from constructor to field
    Draw draw; //creating a new deck to draw from
    Discard discard; // Takes played cards
    private ArrayList<Player> playerList; // creates array list to store players in



    public UnoGame() {

        draw = new Draw ();
        discard = new Discard ();
        this.playerList = new ArrayList<>(10);

        // pop 7 from stack - get player.length, for every player, pop 7 to player.hand
        //pop 1 card to discard stack

    }

    void startGame() throws InvalidNumberOfPlayersException {
        if (playerList.size() < 1  ) {
            throw new InvalidNumberOfPlayersException();
        }
        if (playerList.size() > 9) {
            throw new InvalidNumberOfPlayersException();
        }
    }

    UnoGame unoGame = new UnoGame();

    String getGameName(){
        return gameName; // i added a return for this method JTK
    }

        public void insertCoin() {
            ++balance;
        }

    int getBalance(){
        return balance;
    }    // i added a get balance method JTK


    String getGameState(){
        return gameState;
    }

    void startRound() {

        Collections.shuffle(draw);

        // for each player give seven cards

        for (Player player: playerList) {
            Card card = draw.takeTopCard();
            player.getHand().addCard(card);
        }

        discard.push(Draw.draw.pop());
    }


    // String sendCommand(Command command) throws InvalidCommandException{

    // }

    void addPlayer(String name) throws InsufficientFundsException {
        if (balance < 2) {
            throw new InsufficientFundsException("Insert more coins"); // needs changing
        } else {
            Player player = new Player(name);
            this.playerList.add(player); // adds all players of UnoGame by name JT
        }
    }


    void removePlayer(String name) {
        this.playerList.remove(name); // removes player by name JT
    }

    List<Player> getPlayers () {
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