package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidCommandException;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.ArrayList;
import java.util.List;


public class UnoGame implements TextGame {

    private String gameName; //removed parameters from here & moved from constructor to field JTK
    private String gameState; //added a gameState
    private int balance; //moved from constructor to field
    private Draw draw; //creating a new deck to draw from
    private Discard discard; // Takes played cards
    private ArrayList<Player> playerList; // creates array list to store players in
    private Player currentPlayer; //Stores CurrentPlayer
    private int currentPlayerNumber; //Stores currentPlayerNumber

    public UnoGame() {
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


    public void removePlayer(int ArrayIndex) {
        this.playerList.remove(ArrayIndex); // removes player by ArrayIndex position JT
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
        //call the deck and adds 7 into each players hand plus puts one card into discard pile.
        for (int i=0; i < 7; i++){
            for (Player player: playerList) {
                Card card = draw.takeTopCard();
                player.getHand().addCard(card);
            }
        }
        //Puts first card down
        discard.addCard(draw.takeTopCard());
    }

    void getPeekAtCard() {
        System.out.println("Top card is " + discard.peakAtCard() ) ;

    }

    /**
     * Current player to see cards in own hand
     * @return
     */
    Hand seeMyHand(int currentPlayerIndex) {
        Player player;
        player = playerList.get(currentPlayerIndex);
        return player.getHand();
    }

    /**
     * Current player to see selected players hand size.
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



    public void playSelectedCard(int position) throws InvalidMoveException, NoCardInPositionException {
    currentPlayer = currentPlayer();
    Hand currentHand = currentPlayer.getHand();
    Card card = currentHand.getCardAtPosition(position);

        if (discard.canCardBePlayed(card) == true) {
            currentPlayer = currentPlayer();
            currentPlayer.getHand().removeCard(card).discard.addCard(card);

        }

    }

    public Player getCurrentPlayer() {

       return currentPlayer = playerList.get(currentPlayerNumber);

}
    /**
     * Method for moving to next player. Each time a player has put down a card or passed their turn, this method will need to be called to
     * move to the next person in the player list.
     */
     void goToNextPlayer() {
         currentPlayerNumber = (currentPlayerNumber + 1 + playerList.size()) % playerList.size();
     }


     Player currentPlayer() {
        return getCurrentPlayer();
     }

    /**
     * Method for pass. If current player is unable to play a card, they must pick up the top card from the draw pile.
     */
    void pass() {
    currentPlayer = currentPlayer();
        Card card = draw.takeTopCard();
        Hand hand = currentPlayer.getHand();
        hand.addCard(card);

            }

/*    public String winGame(Player player) {
         if (Player.this.hand.size() < 0)
        System.out.println("Congratulations" + Player.getName() + "You've won this round!");
        return null;
    }*/

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

    @Override
    public String getGameName() {
        return null;
    }


}