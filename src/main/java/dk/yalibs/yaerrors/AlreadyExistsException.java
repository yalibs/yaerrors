package dk.yalibs.yaerrors;

/**
 * Thrown to indicate that a resource already exists.
 */
class AlreadyExistsException extends RuntimeException {
    /**
     * Constructs an {@link AlreadyExistsException} with no detail message.
     */
    public AlreadyExistsException() {
        this("resource already exists");
    }

    /**
     * Constructs an {@link AlreadyExistsException} with the specified detail message.
     * @param message the detail message
     */
    public AlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Constructs an {@link AlreadyExistsException} with the specified cause and a detail message of cause (which typically contains the class and detail message of cause).
     * @param cause the underlying cause of this error
     */
    public AlreadyExistsException(Throwable cause) {
        this(cause == null ? "resource already exists" : cause.getMessage(), cause);
    }

    /**
     * Constructs an {@link AlreadyExistsException} with the specified detail message and a cause.
     * @param message a custom error message
     * @param cause the underlying cause of this error
     */
    public AlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}

