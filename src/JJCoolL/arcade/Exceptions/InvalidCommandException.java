package JJCoolL.arcade.Exceptions;

public class InvalidCommandException extends Throwable {

    public InvalidCommandException(String message) {
        super(message);
    }

    public InvalidCommandException (String message, Throwable cause) {
        super(message, cause);
    }
}