package model;

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
    //test if 
      BankAccount bc=new BankAccount();
      bc.withdraw(5);
      assertEquals("balance",0.0,bc.getBalance(),10.0);
    }

    @Test
    public void setaccountNumber() {
    }

    @Test
    public void setBalance() {
    }
}