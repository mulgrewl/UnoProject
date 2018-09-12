package JJCoolL.arcade.Exceptions;

public class InvalidNumberOfPlayersException extends Exception {

    public InvalidNumberOfPlayersException() {

    }
    public InvalidNumberOfPlayersException(String message) {
        super(message);
    }

    public InvalidNumberOfPlayersException(String message, Throwable cause) {
        super(message, cause);
    }
}
