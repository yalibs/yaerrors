package dk.yalibs.yaerrors;

/**
 * Thrown to indicate that the search did not find any matches.
 *
 * Useful when you dont want to throw a {@link NullPointerException} when searching a collection.
 */
public class NotFoundException extends RuntimeException {
    /**
     * Constructs a {@link NotFoundException} with no detail message.
     */
    public NotFoundException() {
        this("resouce was not found");
    }

    /**
     * Constructs a {@link NotFoundException} with the specified detail message.
     * @param message the detail message
     */
    public NotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a {@link NotFoundException} with the specified cause and a detail message of cause (which typically contains the class and detail message of cause).
     * @param cause the underlying cause of this error
     */
    public NotFoundException(Throwable cause) {
        this(cause == null ? "resouce was not found" : cause.getMessage(), cause);
    }

    /**
     * Constructs a {@link NotFoundException} with the specified detail message and a cause.
     * @param message the detail message
     * @param cause the underlying cause of this error
     */
    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

