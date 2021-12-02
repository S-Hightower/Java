import java.util.*;

//Create a BankAccount class.
public class BankAccount{
//The class should have the following attributes: (double) checking balance, (double) savings balance.
    double checkingBalance;
    double savingsBalance;
//Create a class member (static) that has the number of accounts created thus far.
    public static int numOfAccounts;
//Create a class member (static) that tracks the total amount of money stored in every account created.
    public static int storedAmount;

//In the constructor, be sure to increment the account count.
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numOfAccounts++;
    }

        public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        storedAmount += checkingBalance + savingsBalance;
    }

//Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checkingBalance;
    }
//Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return savingsBalance;
    }

//Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void depositMoney(double depositAmount, String accountLabel) {
        if (accountLabel == "checkingBalance" || accountLabel == "checking") {
            this.checkingBalance += depositAmount;
            storedAmount += depositAmount;
            System.out.println(depositAmount + " has been deposited into checking.");
        }
        else if (accountLabel == "savingsBalance" || accountLabel == "savings") {
            this.savingsBalance += depositAmount;
            storedAmount +=depositAmount;
            System.out.println(depositAmount + " has been deposited into savings.");
        }
        else {
            System.out.println("....you sure about that....");
        }
    }
//METHODS NEED PARENTHESES!!!!!!!!!!
//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney(double withdrawAmount, String accountLabel) {
        if (accountLabel == "checkingBalance" || accountLabel == "checking") {
            if (withdrawAmount <= this.checkingBalance) {
                this.checkingBalance -= withdrawAmount;
                storedAmount -= withdrawAmount;
                System.out.println(withdrawAmount + " has been withdrawn from checking.");
            }
            else {
                System.out.println("Don't worry. We're all broke. <3");
                System.out.println("Your checking balance is " + this.getCheckingBalance());
            }
        }
        else if (accountLabel == "savingsBalance" || accountLabel == "savings") {
            if (withdrawAmount <= this.savingsBalance) {
                this.savingsBalance -= withdrawAmount;
                storedAmount -= withdrawAmount;
                System.out.println(withdrawAmount + " has been withdrawn from savings.");
            }
            else {
                System.out.println("Don't worry. We're all broke. <3");
                System.out.println("Your savings balance is " + this.getSavingsBalance());
            }
        }
        else {
            System.out.println("You really trying it, huh?");
        }
    }
//Create a method to see the total money from the checking and saving.
    public void totalAccountBalance() {
        System.out.println("Total account balance is: " + (this.getSavingsBalance() + this.getCheckingBalance()));
    }
//Users should not be able to set any of the attributes from the class.
//no setters
}