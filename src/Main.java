import exceptions.DateValidationException;
import exceptions.InsufficientBalanceException;
import exceptions.NegativeBalanceException;
import model.BankAccount;
import model.CheckingAccount;
import model.SavingAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DateValidationException, InsufficientBalanceException, NegativeBalanceException {
        Scanner c = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        CheckingAccount ca = new CheckingAccount();
        SavingAccount sa = new SavingAccount();
        char ch;
        do {
            System.out.println("Select the account to use");
            System.out.println("1.DefaultAccount");
            System.out.println("2.Saving Account");
            System.out.println("3.Checking Account");
            int choice = c.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Select the action to perform");
                    System.out.println("1.Withdraw");
                    System.out.println("2.Deposit");
                    System.out.println("3.Calculate Interest");
                    System.out.println("4.displayAccountInfo");
                    System.out.println("5.Display Balance");
                    int choice1 = c.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Enter amount");
                            double amount = c.nextDouble();
                            ba.withdraw(amount);
                            break;
                        case 2:
                            System.out.println("Enter amount");
                            double amount1 = c.nextDouble();
                            ba.deposit(amount1);
                            break;
                        case 3:
                            ba.calculateInterest();
                            break;
                        case 4:
                            ba.displayAccountInfo();
                            break;
                        case 5:
                            ba.accountBalance();
                            break;
                        default:
                            System.out.println("Invalid input");
                    }
                case 2:
                    System.out.println("Select the action to perform");
                    System.out.println("1.Withdraw");
                    System.out.println("2.Calculate Interest");
                    int choice2 = c.nextInt();
                    switch (choice2) {
                        case 1:
                            //default value of balance is 0 hence will throw an error
                            System.out.println("Enter amount");
                            double amount1 = c.nextDouble();
                            sa.withdraw(amount1);
                        case 2:
                            sa.calculateInterest();
                    }
                case 3:
                    System.out.println("Select the action to perform");
                    System.out.println("1.Withdraw");
                    System.out.println("2.Calculate Interest");
                    int choice3 = c.nextInt();
                    switch (choice3) {
                        case 1:
                            //default value of balance is 0 hence will throw an error
                            System.out.println("Enter amount");
                            double amount1 = c.nextDouble();
                            ca.withdraw(amount1);
                        case 2:
                            ca.calculateInterest();
                    }

            }
            System.out.println("do you want to continues? \n");
            ch = c.next().charAt(0);
        }
        while (ch == 'y' || ch == 'Y');
    }
}
