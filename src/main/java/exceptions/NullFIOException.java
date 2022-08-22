package exceptions;

public class NullFIOException extends IllegalStateException {
    public NullFIOException(String s) {
        super(String.format("Значение %s не должно быть пустым ", s));
    }
}
