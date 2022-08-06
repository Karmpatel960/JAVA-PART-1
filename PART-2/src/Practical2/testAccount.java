/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*Design a class named Account that contains:
• A private int data field named id for the account (default 0).
• A private double data field named balance for the account (default 500₹).
• A private double data field named annualInterestRate that stores the current
interest rate (default 7%). Assume all accounts have the same interest rate.
• A private Date data field named dateCreated that stores the date when the
account was created.
• A no-arg constructor that creates a default account.
• A constructor that creates an account with the specified id and initial balance.
• The accessor and mutator methods for id, balance, and annualInterestRate.
• The accessor method for dateCreated.
• A method named getMonthlyInterestRate() that returns the monthly interest rate.
• A method named getMonthlyInterest() that returns the monthly interest.
• A method named withdraw that withdraws a specified amount from the account*/
package Practical2;

import java.util.Scanner;

public class testAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID Number :");
        int a=sc.nextInt();
        Account in = new Account(a,500);
        System.out.println("The Annual Intrest Rate is "+in.getAnnualintrest());
        System.out.println("The Monthly Intrest Rate is "+in.getmonthlyintrestrate());
        in.getmonthlyintrestincome();
        System.out.println("Enter Withdrew Amount : ");
        int c = (int) sc.nextDouble();
        in.Withdraw(c);
        System.out.println("Enter Deposit Amount : ");
        int d = (int) sc.nextDouble();
        in.deposit(d);
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");
    }
}
