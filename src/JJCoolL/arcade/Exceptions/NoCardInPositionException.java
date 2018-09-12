package JJCoolL.arcade.Exceptions;

public class NoCardInPositionException extends Exception
    {
        public NoCardInPositionException()
        {
            super();
        }

        public NoCardInPositionException(String message) {
            super (message);
        }

        public NoCardInPositionException(String message , Throwable cause) {
            super(message , cause);
        }
    }


