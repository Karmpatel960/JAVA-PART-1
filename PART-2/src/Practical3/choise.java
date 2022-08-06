/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/

package Practical3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class choise {
    public static void main(String[] args) {
        double balance = 300;
        double balance1 = 300;

        Scanner in = new Scanner(System.in);
boolean flag =true;
        List<String> stringList = Arrays.asList("AC101", "AC102", "AC103", "AC104", "AC105", "AC106", "AC107", "AC108", "AC109", "AC110");
        System.out.println("Enter The Account Number : ");
        String compareTo = in.next();
        if (stringList.contains(compareTo)) {
            System.out.println("1. Balance inquiry\n" +
                    "2. Withdraw money [Maintain minimum balance 300₹]\n" +
                    "3. Deposit money\n" +
                    "4. Money Transfer\n" +
                    "5. Create Account\n" +
                    "6. Deactivate Account\n" +
                    "7. Exit ");
            System.out.println("Enter the Number for Doing Action In Account :");
            int a = in.nextInt();
            while (flag){


            switch (a) {
                case 1: {
                    System.out.println("Your Balance in Account is " + balance);

                }
                case 2: {
                    System.out.println("Enter Amount to Withdraw :");
                    int d = in.nextInt();
                    System.out.println("The Balance After Withdraw is " + (balance - d));

                }
                case 3: {
                    System.out.println("Enter Amount to Deposit :");
                    int w = in.nextInt();
                    System.out.println("The Balance After Deposit is " + (balance - w));

                }
                case 4: {
                    if (balance >= 300) {
                        System.out.println("Enter Account Number to Transfer :");
                        String acc = in.next();
                        System.out.println("Enter Amount to Transfer :");
                        int amo = in.nextInt();
                        balance1 = balance1 + amo;
                        System.out.println("Amount Transfered is " + balance1);
                        balance = balance - amo;
                        System.out.println("Amount Remain in Account is " + balance);
                    } else {
                        System.out.println("Insufficient Balance in Account !!!");
                    }

                }
                case 5: {

                    String create = in.next();

                    int c = 10;
                    String id = "AC00" + c++;
                    System.out.println("Account  Created");

                }
                case 6: {
                    String create = in.next();
                    int c = 10;
                    String id = "AC0" + c--;
                    System.out.println("Account is Removed");

                }
                case 7: {
                    flag =false;
                }
                break;
                default:
                    System.out.println("Enter Valid Choise!!");
            }
                System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");
            }
        }

    }
}






