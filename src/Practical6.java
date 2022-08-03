/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
/*Given an array of strings, return a new array without the strings that are equal to
the target string. One approach is to count the occurrences of the target string, make
a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
*/
import java.util.Arrays;


public class Practical6 {
    public static void main(String[] args) {

            String[] b = {"a", "b", "c", "a"};
            String[] a= words(b, "b");

            System.out.println(Arrays.toString(a));
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");

    }

    public static  String[] words(String[] w, String t){
            int f = 0;
        for (String s : w) {
            if (s.equals(t)) {
                f++;
            }
        }
            f = w.length - f;
            int place = 0;
            String[] str = new String[f];
        for (String s : w) {
            if (!s.equals(t)) {
                str[place] = s;
                place++;
            }
        }
            return str;
    }
}
