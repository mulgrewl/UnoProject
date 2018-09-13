package JJCoolL.arcade.Exceptions;

public class InsufficientFundsException extends Exception {


    public InsufficientFundsException() {

    }
    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException e (String message, Throwable cause) {
        super (message, cause);
    }
}