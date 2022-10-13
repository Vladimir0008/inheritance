package lesson3.homework.task5.exception;

public class DistanceException  extends Exception{
    public DistanceException() {
    }

    public DistanceException(String message) {
        super(message);
    }

    public DistanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public DistanceException(Throwable cause) {
        super(cause);
    }

    public DistanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
