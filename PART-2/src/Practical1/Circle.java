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
