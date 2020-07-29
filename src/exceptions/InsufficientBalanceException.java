package exceptions;

public class InsufficientBalanceException extends Exception{
    //check if amount to withdraw is greater than balance if not it throws an exception
    public InsufficientBalanceException() {
        super("insufficient balance");
    }
}
