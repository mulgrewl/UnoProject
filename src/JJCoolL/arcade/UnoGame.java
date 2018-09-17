package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidCommandException;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;

import java.util.ArrayList;
import java.util.List;


public class UnoGame implements TextGame {

    private String gameName; //removed parameters from here & moved from constructor to field JTK
    private String gameState; //added a gameState
    private int balance; //moved from constructor to field
    private Draw draw; //creating a new deck to draw from
    private Discard discard; // Takes played cards
    private ArrayList<Player> playerList; // creates array list to store players in
    private Player currentPlayer;
    private int currentPlayerNumber;

    public UnoGame() {
        //UnoGame unoGame = new UnoGame();
        draw = new Draw ();
        discard = new Discard ();
        this.playerList = new ArrayList<>(10);
    }

    public void insertCoin() {
        ++balance;
    }

    int getBalance(){
        return balance;
    }

    public String getGameName(String name) {
        return name;
    }

    public void addPlayer(String name) throws InsufficientFundsException {
        if (balance < 2) {
            throw new InsufficientFundsException("Insert more coins");
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
        //call the deck

        for (int i=0; i < 7; i++){
            for (Player player: playerList) {
                Card card = draw.takeTopCard();
                player.getHand().addCard(card);
            }
        }

        //discard.addCard(draw.takeTopCard());
    }

    /**
     * Current player to see own hand
     * @return
     */
    Hand seeMyHand(int currentPlayerIndex) {
        Player player;
        player = playerList.get(currentPlayerIndex);
        return player.getHand();
    }

    /**
     * Current player to see other players hand
     * @return
     */

    public int getPlayerHandSize(int currentPlayerIndex) {
        Player player;
        player = playerList.get(currentPlayerIndex);
        return player.getHand().numberOfCards();
    }

    public Player getPlayerIndex(int currentPlayerIndex) {
        Player player = playerList.get(currentPlayerIndex);
        return player;
    }

    public int getNumberOfPlayers() {
        return this.playerList.size();
    }



    public void playSelectedCard(Card card) throws InvalidMoveException, NoCardInPositionException {
       // int position = hand.indexOf(selectedCard);
        // position to card conversion here

        if (discard.canCardBePlayed(card) == true) {

       // Player currentPlayer = getPlayerIndex(currentPlayerIndex);
            // player.getHand()
            currentPlayer.getHand().removeCard(card).discard.addCard(card);

        }
    //    return null;

    }


    public Player getCurrentPlayer() {
        // determines who's go it is next.
       return currentPlayer = playerList.get(currentPlayerNumber);
       // get Player from the number in the array
}


    //void goToNextPlayer(){

    // for(currentPlayer = 0; currentPlayer < getNumberOfPlayers(); currentPlayer++) {
    // if (currentPlayer == getNumberOfPlayers()){
    // currentPlayer = 0;
    // continue;
    // }
    // currentPlayer++;

    // }

    // }

//    void goToNextPlayer(){
//        while(currentPlayer < getNumberOfPlayers()) {
//            for(currentPlayer = 0; currentPlayer < getNumberOfPlayers(); currentPlayer++){
//                //currentPlayer++;
//                System.out.println("" + currentPlayer);
//            }
//            if (currentPlayer == getNumberOfPlayers()){
//                currentPlayer = 0;
//
//            }



//    public Card playSelectedCard(Card card) throws InvalidMoveException {
//        Player player;
//        if(discard.canCardBePlayed(card) == true) {
//            currentPlayer.getHand().removeCard(card).discard.addCard(card);
//        }
//        return card;
//    }


    public String winGame(Player name) {
        /*  if (Player.handsize < 0 && Player.callUno)
        System.out.println("Congratulations" + Player.getName) + "You've won this round!");*/
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