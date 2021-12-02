import java.util.*;

public class BankAccountTest {
    public static void main(String[] args) {

//test cases remember: checking,savings in params
    BankAccount Namjoon = new BankAccount(100000, 600000);
    BankAccount Yoongi = new BankAccount(200000, 800000);
    BankAccount Shawna = new BankAccount(900, 50);

    Namjoon.totalAccountBalance();
    Yoongi.totalAccountBalance();
    Shawna.totalAccountBalance();

    System.out.println("Total bank balance: " + BankAccount.storedAmount);
    }
}