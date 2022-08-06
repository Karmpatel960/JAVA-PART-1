/*Prepared By PATEL KARM HITESHKUMAR(21CE095)*/
/*Design a class named Circle containing following attributes and behavior.
• One double data field named radius. The default value is 1.
• A no-argument constructor that creates a default circle.
• A Single argument constructor that creates a Circle with the specified radius.
• A method named getArea() that returns area of the Circle.
• A method named getPerimeter() that returns perimeter of it*/

package Practical1;

public class Circle {
        double a=1;
        public Circle(){

        }
        public Circle(int a){
            this.a = a;
            System.out.println("The Circle's Radius is "+a);
        }
        public double getarea(){
            return (3.14*a*a);
        }
        public double getperimeter(){
            return (2*3.14*a);
        }



}
