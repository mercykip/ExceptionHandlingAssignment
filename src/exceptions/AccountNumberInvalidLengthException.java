package exceptions;

public class AccountNumberInvalidLengthException extends Exception{
    public AccountNumberInvalidLengthException() {
        super("Invalid length for account number");
    }
}
