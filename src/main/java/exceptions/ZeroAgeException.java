package exceptions;

public class ZeroAgeException extends IllegalArgumentException{
    public ZeroAgeException(String s) {
        super(String.format("Значение %s не должно быть отрицательным", s));
    }
}
