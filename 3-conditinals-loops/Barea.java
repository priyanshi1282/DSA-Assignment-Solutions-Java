//        Area Of Circle Java Program
//        Area Of Triangle
//        Area Of Rectangle Program
//        Area Of Isosceles Triangle
//        Area Of Parallelogram
//        Area Of Rhombus
//        Area Of Equilateral Triangle
public class Barea {
    public static void main(String[] args) {
        System.out.println("area of circle : " + circle(10));
        System.out.println("area of triangle : " + triangle(10,10));
        System.out.println("area of rectangle : " + rectangle(10,10));
        System.out.println("area of isosceles triangle : " + isosceles(10,10));
        System.out.println("area of parallelogram : " + parallelogram(10,10));
        System.out.println("area of rhombus : " + rhombus(10,10));
        System.out.println("area of equi trinagle : " + equiTriangle(10));
    }
    static double circle(double r){
        return 3.14*r*r;
    }
    static double triangle(double base, double height){
        return 0.5*base*height;
    }
    static double rectangle(double l, double b){
        return l*b;
    }

    static double isosceles(double a, double b){
        double ans = Math.pow(a,2) - Math.pow(b,2)/4.0;
        return (Math.sqrt(ans)*b)/2.0;
    }

    static double parallelogram(double base, double height){
        return base*height;
    }
    static double rhombus(double d1, double d2){
        return 0.5*d1*d2;
    }

    static double equiTriangle(double a){
        return (Math.sqrt(3)*Math.pow(a,2))/4;
    }
}
