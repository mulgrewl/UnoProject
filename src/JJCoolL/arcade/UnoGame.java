package JJCoolL.arcade;


import JJCoolL.arcade.Exceptions.InsufficientFundsException;

public class UnoGame implements JJCoolL.arcade.TextGame {
    private String gameName;
    private String gameState;
    private Player player;
    private Players playerList;
    int balance;
    Deck deck;


    public UnoGame() {
        //    game = new UnoGame;
        Deck draw;

    }

    // pop 7 from stack - get player.length, for every player, pop 7 to player.hand
    //pop 1 card to discard stack


   /* void startRound() {
        Collections.shuffle(Deck.draw) {
            Iterator it = Player.player.iterator();
            while (it.hasNext())
                for (int i = 0; i < 7; i++) {
                    i = Deck.draw.pop();
                    Deck.hand.add(i);
                }
        }

        discard.push(Deck.draw.pop());


    }*/

   //hellooooo


    String getGameName() {
        return gameName;
    }

  int getBalance() {
      return balance;

  }
    public void insertCoin() {
        ++balance;
    }

   // void startGame() throws InvalidNumberOfPlayersException;
    //getPlayers
    //if player.length < 2
    //throw new InvalidNumberOFPlayersException(not enough players, you need at least two players to play")


  //  void endGame();

    String getGameState() {
        return gameState;
    }

   // String sendCommand(Command command) throws InvalidCommandException;


    void addPlayer(Player player) throws InsufficientFundsException {

        if (balance < 2) {
            throw new InsufficientFundsException("not enough coins inserted, try again.");
        } else {


            this.player = new Player(" ");
            }
        }

}

   // void removePlayer(Player player) {

   // }


   /* List<Player> getPlayers();

    {

    }

    String getScoreboard();

    String getHelp();

    List<Deck> seeHand(currentPlayer) {
        List<Deck> hand = new ArrayList<Deck>();


        void playCard ( int x, String y );

        void passCard ();

        Player currentPlayer (Player newplayer);

        Player nextPlayer (currentPlayer);

        int getPlayerHandSize (Player hand);

        String winGame ();
        public void checkHandForCard();

    }

}
*/