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
