package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidCommandException;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;
import JJCoolL.arcade.Exceptions.NoCardInPositionException;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.util.ArrayList;
import java.util.List;

/**
 * A class intended to define the rules and flow of the uno game.
 *
 * @author Jardel K, Jodie T, Lucy M
 * @version 2018.09.10-001
 */

public class UnoGame implements TextGame {

    private String gameName; //removed parameters from here & moved from constructor to field.
    private String gameState; //added a gameState
    private int balance; //moved from constructor to field
    private Draw draw; //creating a new deck to draw from
    private Discard discard; // Takes played cards
    private ArrayList<Player> playerList; // creates array list to store players in.
    private Player currentPlayer; //Stores CurrentPlayer
    private int currentPlayerNumber; //Stores currentPlayerNumber

    /**
     * Constructor calls and instantiates a new draw deck of cards, an empty deck for the discard pile and an array list
     * with the initial capacity of 10 spaces to store players. JK, JT, LM.
     */

    public UnoGame() {
        draw = new Draw ();
        discard = new Discard ();
        this.playerList = new ArrayList<>(10);
    }

    /**
     * Method to add one coin at a time to play UnoGame
     */
    public void insertCoin() {
        ++balance;
    }

    /**
     * Stores the balance of coins added.
     * @return // balance of inserted coins
     */
    int getBalance(){
        return balance;
    }

    /**
     * Intended method to return the name of the game selected.
     * @param name expects input of type string for name.
     * @return// Returns the name of the game selected.
     */
    public String getGameName(String name) {
        return name;
    }

    /**
     * Method to validate if user has inserted enough coins to play and can add players to playerList array list.
     * @param name expects input of type string for name.
     * @throws InsufficientFundsException if number of coins inserted is below 2.
     */
    public void addPlayer(String name) throws InsufficientFundsException {
        if (balance < 2) {
            throw new InsufficientFundsException("Insert more coins");
        } else {
            Player player = new Player(name);
            this.playerList.add(player); // adds all players of UnoGame by name JT
        }
    }

    /**
     * Method to allow users to remove players by position in array index. JT
     * @param ArrayIndex expects a type int to be able remove a player.
     */

    public void removePlayer(int ArrayIndex) {
        this.playerList.remove(ArrayIndex); // removes player by ArrayIndex position JT
    }

    /**
     * Method to list all added players. JT
     * @return Lists all players within the playerList Array List
     */
    public List<Player> getPlayers() {
        return this.playerList;
    }

    /**
     * Method to determine if game can start. Checks that there is more than one player and less than 10 players. JT
     * @throws InvalidNumberOfPlayersException if number of players is below two or greater than ten.
     */
    //Determines if game has enough players to begin -JT
    public void startGame() throws InvalidNumberOfPlayersException {
        if (playerList.size() < 1  ) {
            throw new InvalidNumberOfPlayersException();
        }
        if (playerList.size() > 9) {
            throw new InvalidNumberOfPlayersException();
        }
    }

    /**
     * Intended method to return game state. EG "Game loading, are you ready to start the round?".
     * @return Should return the game state as type string.
     */
    public String getGameState(){
        return gameState;
    }

    /**
     * Method to assure that everything needed to play a round is ready. Calls the deck and adds seven cards to each players
     * hand. Then adds one card to the discard pile. JK, JT, LM.
     */

    void startRound() {

        for (int i=0; i < 7; i++) {
            for (Player player : playerList) {
                Card card = draw.takeTopCard();
                player.getHand().addCard(card);
            }
        }
        discard.addCard(draw.takeTopCard());
    }

    /**
     *  Method for user to look at the card on the discard pile so that they can determine which card to play next. JK, LM.
     */
    void getPeekAtCard() {
        System.out.println("Top card is " + discard.peakAtCard() ) ;

    }

    /**
     * Current player to see cards in own hand
     * @return // Cards in selected players hand. JT.
     */
    Hand seeMyHand(int currentPlayerIndex) {
        Player player;
        player = playerList.get(currentPlayerIndex);
        return player.getHand();
    }

    /**
     * Current player to see selected players hand size.
     * @return number of cards that a selected player is holding. JT.
     */
    public int getPlayerHandSize(int currentPlayerIndex) {
        Player player;
        player = playerList.get(currentPlayerIndex);
        return player.getHand().numberOfCards();
    }

    /**
     * Method to find current player index
     * @param currentPlayerIndex expects an input type of int.
     * @return // Player number
     */
    public Player getPlayerIndex(int currentPlayerIndex) {
        Player player = playerList.get(currentPlayerIndex);
        return player;
    }

    /**
     * Method to get number of players withing playerList array list. JT
     * @return // Number of players within list.
     */
    public int getNumberOfPlayers() {
        return this.playerList.size();
    }

    /**
     * Method to play a selected card. Allows a player to choose a card by position in hand and add to the discard pile. JK, LM.
     * @param position
     * @throws InvalidMoveException throws if card cannot be placed on top of discard stack.
     * @throws NoCardInPositionException throws if player is trying to play a card that doesn't exist in their hand.
     */
    public void playSelectedCard(int position) throws InvalidMoveException, NoCardInPositionException {
    currentPlayer = currentPlayer();
    Hand currentHand = currentPlayer.getHand();
    Card card = currentHand.getCardAtPosition(position);

        if (discard.canCardBePlayed(card) == true) {
            currentPlayer = currentPlayer();
            currentPlayer.getHand().removeCard(card).discard.addCard(card);

        }

    }

    /**
     * Method for player by position to see who's turn it is. JK.
     * @return current player.
     */
    public Player getCurrentPlayer() {

       return currentPlayer = playerList.get(currentPlayerNumber);

}
    /**
     * Method for moving to next player. Each time a player has put down a card or passed their turn, this method will need to be called to
     * move to the next person in the player list. JK.
     */
     void goToNextPlayer() {
         currentPlayerNumber = (currentPlayerNumber + 1 + playerList.size()) % playerList.size();
     }

    /**
     * Returns the result of current player when goToNextPlayer method has been executed. JK.
     * @return
     */
     Player currentPlayer() {
        return getCurrentPlayer();
     }

    /**
     * Method for pass. If current player is unable to play a card, they must pick up the top card from the draw pile. JK
     */
    void pass() {
    currentPlayer = currentPlayer();
        Card card = draw.takeTopCard();
        Hand hand = currentPlayer.getHand();
        hand.addCard(card);

            }

/*
    //Intended method to determine if a player has no cards and uno has been called, return the winner.
    public String winGame(Player player) {
         if (Player.this.hand.size() < 0)
        System.out.println("Congratulations" + Player.getName() + "You've won this round!");
        return null;
    }*/

    //Intended method to list players scores of each round. A scoreboard class would have been needed.
    public String getScoreboard(){
        return null;
    }

    //Intended method to end the uno game and return to arcade machine.
    public void endGame() {

    }

    //Intended method to catch incorrect commands and prompt user to type in new command.
    public String sendCommand(Command command) throws InvalidCommandException {
        return null;
    }

    //Intended method to return the help message any time the command "Help" is called by the user.
    public String getHelp(){
        return null;
    }

    @Override
    public String getGameName() {
        return null;
    }


}