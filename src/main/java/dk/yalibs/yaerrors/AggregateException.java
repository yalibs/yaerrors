package dk.yalibs.yaerrors;

import java.util.ArrayList;
import java.util.List;

/**
 * Thrown to indicate a collection of errors.
 *
 * Useful to collect errors when iterating over some collection and error may occur.
 */
public class AggregateException extends RuntimeException {
    private final List<Throwable> causes;

    /**
     * Constructs an empty {@link AggregateException}
     */
    public AggregateException() {
        super();
        this.causes = new ArrayList<>(0);
    }

    /**
     * Constructs an {@link AggregateException} with a list of causes
     * @param causes a list of causes
     */
    public AggregateException(List<Throwable> causes) {
        super("errors occurred: "+causes.size());
        this.causes = causes;
    }

    /**
     * Constructs an {@link AggregateException} with an array of causes
     * @param causes an array of causes
     */
    public AggregateException(Throwable... causes) {
        this(List.of(causes));
    }

    /**
     * Get the list of underlying aggregated causes
     * @return the list of aggregated causes
     */
    public List<Throwable> getCauses() {
        return causes;
    }

    @Override
    public String getMessage() {
        var sb = new StringBuilder();
        for(var c : causes)
            sb.append(c.getMessage()).append("\n");
        return sb.toString();
    }
}

