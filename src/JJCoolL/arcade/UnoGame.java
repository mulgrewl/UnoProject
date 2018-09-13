package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidCommandException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnoGame implements TextGame {

    private String gameName; //removed parameters from here & moved from constructor to field JTK
    private String gameState; //added a gameState
    private int balance; //moved from constructor to field
    private Draw draw; //creating a new deck to draw from
    private Discard discard; // Takes played cards
    private ArrayList<Player> playerList; // creates array list to store players in

    public UnoGame() {
        UnoGame unoGame = new UnoGame();
        draw = new Draw ();
        discard = new Discard ();
        this.playerList = new ArrayList<>(10);

        // To Do: pop 7 from stack - get player.length, for every player, pop 7 to player.hand
        //pop 1 card to discard stack

    }
    public void insertCoin() {
        ++balance;
    }

    int getBalance(){
        return balance;
    }

    public String getGameName(){
        return gameName; // i added a return for this method JTK
    }

    public void addPlayer(String name) throws InsufficientFundsException {
        if (balance < 2) {
            throw new InsufficientFundsException("Insert more coins"); // needs changing
        } else {
            Player player = new Player(name);
            this.playerList.add(player); // adds all players of UnoGame by name JT
        }
    }


    public void removePlayer(String name) {
        this.playerList.remove(name); // removes player by name JT
    }

    public List<Player> getPlayers() {
        return this.playerList; // Lists all players of game - JT
    }

    //Determines if game has enough players to begin -JT
    public void startGame() throws InvalidNumberOfPlayersException {
        if (playerList.size() < 1  ) {
            throw new InvalidNumberOfPlayersException();
        }
        if (playerList.size() > 9) {
            throw new InvalidNumberOfPlayersException();
        }
    }


    public String getGameState(){
        return gameState;
    }

    void startRound() {

        Collections.shuffle(draw);


        for (Player player: playerList) {
            Card card = draw.takeTopCard();
            player.getHand().addCard(card);
        }

        discard.push(Draw.pop());
    }

    List<Hand> seeHand(currentPlayer) {
        return this.Hand;
    }


    void playCard(int x, String y) {

    }

    void passCard() {
    //Skip player upon command
    }

    Player currentPlayer() {
        return null;
    }

    Player nextPlayer(currentPlayer) {
        return null;
    }

    int getPlayerHandSize(Player hand) {
        return this.hand();
    }

    String winGame() {
        return null;
    }

    public String getScoreboard(){
        return null;
    }

    public void endGame() {

    }


    public String sendCommand(Command command) throws InvalidCommandException {
        return null;
    }

    public String getHelp(){
        return null;
    }


}