/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM : Given 2 strings, a and b, return the number of the positions where they contain the same
length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
*/
import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a= in.next();
        String b= in.next();
        int d=compare(a,b);
        System.out.println(d);
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");
    }
    public static int compare(String a, String b){
        int l =Math.min(a.length(),b.length());
        int c=0;

        for (int i = 0; i < l - 1; i++) {
            String a1 = a.substring(i,i+2);
            String a2 = b.substring(i,i+2);
            if(a1.equals(a2)) {
                c++;
            }
        }
        return c;
    }
}
