/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*Use the Account class created as above to simulate an ATM machine.
Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The
system prompts the users to enter an id. If the id is entered incorrectly, ask
the user to enter a correct id. Once an id is accepted, display menu with
multiple choices.
1. Balance inquiry
2. Withdraw money [Maintain minimum balance 300₹]
3. Deposit money
4. Money Transfer
5. Create Account
6. Deactivate Account
7. Exit */
package Practical3;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Account {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> foos = new ArrayList<>();
    List<String> stringList = Arrays.asList("AC101", "AC102", "AC103", "AC104", "AC105", "AC106", "AC107", "AC108", "AC109", "AC110");
            System.out.println("Enter The Account Number : ");
        String compareTo = in.next();

        for (String string :stringList ) {
            if(string.equals(compareTo)){
                choise n = new choise();
            }
        }
    }




}
