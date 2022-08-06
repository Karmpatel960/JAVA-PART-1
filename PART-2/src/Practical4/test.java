/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*(Subclasses of Account) In Programming Exercise 2, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and
withdraw funds. Create two subclasses for checking and saving accounts. A
checking account has an overdraft limit, but a savings account cannot be
overdrawn. Draw the UML diagram for the classes and then implement them.
Write a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods*/

package Practical4;

public class test {
    public static void main(String[] args) {
        // Create Account, SavingsAccount and Checking Account objects
        Account account = new Account(1122, 20000);
        SavingsAccount savings = new SavingsAccount(1001, 20000);
        CheckingAccount checking = new CheckingAccount(1004, 20000, -20);

        account.setAnnualInterestRate(4.5);
        savings.setAnnualInterestRate(4.5);
        checking.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        savings.withdraw(2500);
        checking.withdraw(2500);

        account.deposit(3000);
        savings.deposit(3000);
        checking.deposit(3000);


        System.out.println(account.toString());
        System.out.println(savings.toString());
        System.out.println(checking.toString());
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");
    }
}

