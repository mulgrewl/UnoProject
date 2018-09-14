package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidCommandException;
import JJCoolL.arcade.Exceptions.InvalidMoveException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;

import java.util.ArrayList;
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
        for (Player player: playerList) {
            Card card = draw.takeTopCard();
            player.getHand().addCard(card);
        }

        discard.addCard(draw.takeTopCard());
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

    int getPlayerHandSize(int currentPlayerIndex) {
        Player player;
        player = playerList.get(currentPlayerIndex);
        return player.getHand().numberOfCards();
    }


    void playCard(int x, String y) throws InvalidMoveException {
        //remove card form position x in hand and add to discard pile
        for (this.playerList) {


            if (removeCard != discard.TopCard.colour || removeCard != discard.TopCard x )
            {
                throw new InvalidMoveException("You can't play that card! Choose another.");
            }

        else if (removeCard == discard.TopCard.colour || removeCard == discard.TopCard x)
            {
                discard.addCard(Card card);
            }

        else player.draw.TopCard && passCard();
        }

        if (this.playerList.handsize < 0 && Player.callUno())

        {break}
    }

    void passCard(int currentPlayerIndex String command) {
    //Skip player upon command
        if (currentPlayerIndex)
        {command ("Pass") == true
        switch player;
        }

    }

    Player whoPlaysNext() {
        // determines who's go it is next.


        return null;
    }


    String winGame(Player name) {
        if (Player.handsize < 0 && Player.callUno)
        System.out.println("Congratulations" + Player.getName) + "You've won this round!");
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