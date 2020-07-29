package model;

import exceptions.AccountNumberInvalidLengthException;
import exceptions.DateValidationException;
import exceptions.InsufficientBalanceException;
import exceptions.NegativeBalanceException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

  @Test
    public void deposit() throws DateValidationException, NegativeBalanceException {
    BankAccount bc=new BankAccount();
    bc.deposit(200.0);
    assertEquals("",200.0,bc.getBalance(),0.0);
    }

    @Test
    public void withdraw() throws DateValidationException, InsufficientBalanceException, NegativeBalanceException {
    //test returns error if amount is more than 1 .default balance is 0
      BankAccount bc=new BankAccount();
      bc.withdraw(0);//a number greater or equal to 1 will result in an error
      assertEquals("balance",0.0,bc.getBalance(),0.0);
    }

    @Test
    public void setaccountNumber() throws DateValidationException, AccountNumberInvalidLengthException {
      BankAccount bc=new BankAccount();
      bc.setaccountNumber("098765");//a string with string less or more than 6 will throw an error
    }

    @Test
    public void setBalance() throws DateValidationException, NegativeBalanceException {
      BankAccount bc=new BankAccount();
      bc.setBalance(23);//-23 will give negative
    }
}