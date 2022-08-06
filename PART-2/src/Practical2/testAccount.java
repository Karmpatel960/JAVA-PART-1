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
