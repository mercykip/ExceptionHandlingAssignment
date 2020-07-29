package exceptions;

public class DateValidationException extends Exception{
    public DateValidationException( ){
        super("Invalid date");
    }
}
