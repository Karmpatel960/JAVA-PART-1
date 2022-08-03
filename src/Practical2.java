/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM : Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so"ozymandias" yields "oz".
 startOz("ozymandias") → "oz"
 startOz("bzoo") → "z"
startOz("oxx") → "o"
*/


import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char[] b = a.toCharArray();
        if (b[0] == 'o') {
            System.out.println(b[0]);
        }
        if (b[1] == 'z') {
            System.out.println(b[1]);
        }
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095");
    }
}
