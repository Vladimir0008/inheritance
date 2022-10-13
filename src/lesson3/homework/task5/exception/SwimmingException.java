package lesson3.homework.task5.exception;

public class SwimmingException extends Exception {
    public SwimmingException() {
    }

    public SwimmingException(String message) {
        super(message);
    }

    public SwimmingException(String message, Throwable cause) {
        super(message, cause);
    }

    public SwimmingException(Throwable cause) {
        super(cause);
    }

    public SwimmingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
