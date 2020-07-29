package exceptions;

public class NegativeBalanceException extends Exception{
    public NegativeBalanceException() {
        super("Account balance cannot be negative");
    }
}
