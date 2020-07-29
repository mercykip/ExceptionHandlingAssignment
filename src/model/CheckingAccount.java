package model;

import exceptions.DateValidationException;
import exceptions.InsufficientBalanceException;
import exceptions.NegativeBalanceException;

public class CheckingAccount extends SavingAccount{

    public CheckingAccount() throws DateValidationException {
        super();
    }

    public CheckingAccount(String accountNumber, String name, double balance) throws DateValidationException {
        super(accountNumber, name, balance);
    }

    @Override
    public void calculateInterest() throws NegativeBalanceException {
        this.setBalance(this.getBalance()+(0.75*this.getBalance()*12));
        System.out.println("Added interest and updated Balance");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, NegativeBalanceException {
        //validating balance
        if(balance<500)
            throw new InsufficientBalanceException();
        super.withdraw(amount);
    }
}
