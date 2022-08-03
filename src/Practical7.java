/*Prepared by PATEL KARM HITESHKUMAR(21CE095)*/
public class Practical7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            space(8 - i);
            for (int j = 0; j < i; j++) {
                int a = (int)Math.pow(2, j);
                num(a);
                System.out.print(a);
            }
            for (int j = i - 2; j >= 0; j--) {
                int b = (int)Math.pow(2, j);
                num(b);
                System.out.print(b);
            }
            System.out.println();
        }
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");

    }
    public static void space(int c) {
        for (int i = 0; i < c; i++)
            System.out.print("   ");
    }
    public static void num(int d) {
        if (d < 10 ||  d < 90) {
            System.out.print("  ");
        } else {
            System.out.print(" ");
        }
    }

}

