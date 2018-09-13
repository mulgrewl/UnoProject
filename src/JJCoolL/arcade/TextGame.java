package JJCoolL.arcade;

import JJCoolL.arcade.Exceptions.InsufficientFundsException;
import JJCoolL.arcade.Exceptions.InvalidCommandException;
import JJCoolL.arcade.Exceptions.InvalidNumberOfPlayersException;
import JJCoolL.arcade.Command;
import JJCoolL.arcade.Player;

import java.util.List;

/**
 * The interface which all text games within the arcade must implement.
 *
 * Update (2018.09.10-002) - Added methods to get the game name and game-specific help.
 *
 * @author Roger Howell
 * @version 2018.09.10-002
 */
public interface TextGame {

    String getGameName(String  name);

    void insertCoin();

    void startGame() throws InvalidNumberOfPlayersException;

    void endGame();

    String getGameState();

    String sendCommand(Command command) throws InvalidCommandException;

    void addPlayer(String name) throws InsufficientFundsException;

    void removePlayer(String name);

    List<Player> getPlayers();

    String getScoreboard();

    String getHelp();
}

