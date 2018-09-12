package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;

import java.util.*;


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
        this.playerList = new ArrayList<Player>(10);

        // pop 7 from stack - get player.length, for every player, pop 7 to player.hand
        //pop 1 card to discard stack

    }

    UnoGame unoGame = new UnoGame();

    void startRound() {
        Collections.shuffle(deck);
        {
            Iterator it = Player.player.iterator();
            while (it.hasNext())
                for (int i = 0; i < 7; i++) {
                    i = Deck.draw.pop();
                    Deck.hand.add(i);
                }
        }
        discard.push(Deck.draw.pop());
    }



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

    void startGame() throws InvalidNumberOfPlayersException {

    }



    void endGame(){

    }

    // String sendCommand(Command command) throws InvalidCommandException{

    // }

    void addPlayer(String name) throws NoCardInPositionException {
        if (balance < 2) {
            throw new NoCardInPositionException("not enough coins inserted, try again."); // needs changing
        } else {
            Player player = new Player(name);
            this.playerList.add(player); // Lists all players of UnoGame by name JT
        }
    }


    void removePlayer(Player player) {

    }

    List<Player> getPlayers(){
        return this.playerList;
    }

    // String getScoreboard(){

    // }

    //String getHelp();

    // List<Deck> seeHand(currentPlayer) {
    // List<Deck> hand = new ArrayList<Deck>();


    // void playCard ( int x, String y );

    // void passCard ();

    // Player currentPlayer (Player newplayer);

    // Player nextPlayer (currentPlayer);

    // int getPlayerHandSize (Player hand);

    // String winGame ();


    // }

}