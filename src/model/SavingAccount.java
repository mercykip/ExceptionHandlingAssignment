package model;

import exceptions.DateValidationException;
import exceptions.InsufficientBalanceException;
import exceptions.NegativeBalanceException;

public class SavingAccount extends BankAccount {

    public SavingAccount() throws DateValidationException {
        super();
    }
    public SavingAccount(String accountNumber, String name, double balance) throws DateValidationException {
        super(accountNumber, name, balance);
    }
    @Override
    public void calculateInterest() throws NegativeBalanceException {
        this.setBalance(this.getBalance()+(this.getBalance()*0.05*12));
        System.out.println("Added interest and updated Balance\n"+this.getBalance());
    }
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, NegativeBalanceException {

        if(this.getBalance()<2500)
        throw new InsufficientBalanceException();
        super.withdraw(amount);//call withdraw method from super class
    }

}
