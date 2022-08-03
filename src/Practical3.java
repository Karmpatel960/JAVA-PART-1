/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
import java.util.Scanner;

public class Practical3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter The First Number :");
        int a = in.nextInt();
        System.out.println("Enter The Second Number :");
        int b = in.nextInt();

        if(digit(a,b)) {
            System.out.println("Your Entered Last Digit of Both Number " + a + " & " + b + " is same");
        }
        else{
            System.out.println("Your Entered Last Digit of Both Number " + a + " & " + b + " is not same");
        }
        System.out.println("Prepared By PATEL KARM HITESHKUMAR(21CE095)");


    }
    public static boolean digit(int c,int d){

        int n=0,m=0;
        n=c%10;
        m=d%10;
        return n==m;
    }
}
