
/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
/*AIM:The problem is to write a program that will grade multiple-choice tests. Assume there are eight
students and ten questions, and the answers are stored in a two-dimensional array. Each row records a
student’s answers to the questions, as shown in the following array.
Students’ Answers to the Questions:
0 1 2 3 4 5 6 7 8 9
Student 0 A B A C C D E E A D
Student 1 D B A B C A E E A D
Student 2 E D D A C B E E A D
Student 3 C B A E D C E E A D
Student 4 A B D C C D E E A D
Student 5 B B E C C D E E A D
Student 6 B B A C C D E E A D
Student 7 E B E C C D E E A D*/

import java.util.Scanner;

public class Practical8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] ans = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String[][] arry = new String[8][10];

        for (int i = 0; i < arry.length; i++) {
            System.out.println("Enter tha Answer's of Student " + i + " : ");
            int c = 0;

            for (int j = 0; j < arry[i].length; j++) {

                arry[i][j] = in.next();

                if (arry[i][j].equalsIgnoreCase(ans[j]))
                    c++;
            }

            System.out.println("The Result of Student " + i + " is " + c);


        }
        System.out.println("Prapared by PATEL KARM HITESHKUMAR(21CE095)");

    }
}

