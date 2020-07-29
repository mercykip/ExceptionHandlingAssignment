package model;

import exceptions.AccountNumberInvalidLengthException;
import exceptions.DateValidationException;
import exceptions.InsufficientBalanceException;
import exceptions.NegativeBalanceException;
import java.util.Date;
public class BankAccount {
    public String accountNumber;
    public String name;
    public double balance;
      Date date;

    public BankAccount() throws DateValidationException{
        this.setDate(new Date());
    }
    public BankAccount(String accountNumber, String name, double balance) throws DateValidationException{
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.name=name;
       setDate(new Date());
    }
    public void displayAccountInfo(){
        System.out.println("Account Information \n"+this.toString());
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    public void accountBalance(){
        //get the value of balance
        System.out.println("account balance\n"+this.getBalance());
    }
    public void deposit(double amount) throws NegativeBalanceException{
        //deposit amount by updating balance
        this.setBalance(this.getBalance()+amount);
        this.accountBalance();//write balance to console
    }
    public void withdraw(double amount) throws InsufficientBalanceException ,NegativeBalanceException{
        //check if amount is greater than balance and throw exception
     if(amount<this.balance) {
        throw new InsufficientBalanceException();
    }
        this.setBalance(this.getBalance()-amount);
        this.accountBalance();////write balance to console
    }
    public void calculateInterest() throws NegativeBalanceException {
        System.out.println("This method will calculate interest");
    }
    //Validate account number
    public void setaccountNumber(String accountNumber) throws AccountNumberInvalidLengthException {
        if(accountNumber.length()!=6)
            throw new AccountNumberInvalidLengthException();
        this.accountNumber = accountNumber;
    }
//Validating balance
    public void setBalance(double balance) throws NegativeBalanceException {
        if(balance<0)
            throw new NegativeBalanceException();
        this.balance = balance;
    }
    //Validating date
    public void setDate(Date date) throws DateValidationException {
        Date date1=new Date();
        if(!date1.equals(date)){
            throw new DateValidationException();
        }
        this.date = date;
    }
    public double getBalance() {
        return balance;
    }
    public Date getDate() {
        return date;
    }
    public String getaccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
