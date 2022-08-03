/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM : Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array
somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/
import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the Number for Element you want to store");
        int a = in.nextInt();
        int b[]=new int [10];
        System.out.println("Enter the Element for Array");
        for (int i = 0; i < a; i++) {
            b[i]=in.nextInt();
        }
        for (int j = 0; j <( b.length-2); j++) {
            if(b[j]==1 && b[j+1]==2 && b[j+2]==3){
                 flag =1;
            }
        }
        if(flag==1){
            System.out.println("True");
        }
        else if(flag==0){
            System.out.println("False");
        }
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");
    }
}
