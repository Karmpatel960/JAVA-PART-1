/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/

package Practical1;

import java.util.Scanner;

public class testcircle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Cicle : ");
        int r = sc.nextInt();
        Circle in = new Circle();
        Circle n1 = new Circle(r);
        double s=n1.getarea();
        System.out.println("The Area of Circle is "+s);
        double d=n1.getperimeter();
        System.out.println("The Perimeter of Circle is "+d);
        System.out.println("Prepared by PATEL KARM HITESHKUMAR(21CE095)");
    }

}
