package Practical2;

import java.util.Date;

public class Account {
private int id=0;
private double balance=500;
private double annualintrest=7;
private Date date = new Date();

    public void Account(){

    }

    public void setId ( int id){
        this.id = id;
    }
    public double setBalance (double balance){
        this.balance = balance;
        return balance;
    }


    public int getId() {
        System.out.println("Your ID Number is "+id);
        return id;
    }
    public double getBalance () {
        return balance;
    }
    public double getAnnualintrest() {
        return annualintrest;
    }
    public Date getDate() {
        System.out.println("The Date is "+date);
        return date;
    }
public Account(int id,double balance){
        setId(id);
        setBalance(balance);
        getId();
        getBalance();
        getDate();

}

    public double getmonthlyintrestrate(){
        double i =getAnnualintrest()/1200;
        return i;
    }
    public void getmonthlyintrestincome(){

        System.out.println("The Monthly Intrest Income is "+getBalance()*getmonthlyintrestrate());

    }
    public double Withdraw(double wd){
        System.out.println("The Amount Before Transection in Your Account is "+getBalance());
        double w= setBalance(getBalance()-wd);
        System.out.println("The Amount Remain After Transection is "+w);
        return 0;
    }
    public double  deposit(double dp){
        System.out.println("The Amount in Your Account is "+getBalance());
        double d=(setBalance(getBalance()+dp));
        System.out.println("The Amount After Deposit is "+d);
        return 0;
    }


}


