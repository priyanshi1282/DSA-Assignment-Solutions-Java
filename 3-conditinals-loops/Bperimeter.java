//        Perimeter Of Circle
//        Perimeter Of Equilateral Triangle
//        Perimeter Of Parallelogram
//        Perimeter Of Rectangle
//        Perimeter Of Square
//        Perimeter Of Rhombus
public class Bperimeter {
    public static void main(String[] args) {
        System.out.println("perimeter of equi triangle : "+  equiTriangle(10));
        System.out.println("perimeter of parallelogram : "+  parallelogram(10,10));
        System.out.println("perimeter of rectangle : "+ rectangle(10,10));
        System.out.println("perimeter of square : "+ square(10));
        System.out.println("perimeter of rhombus : "+ rhombus(10));
        System.out.println("perimeter of circle : "+ circle(10));
    }
    static double rhombus(double side){
        return 4*side;
    }static double square(double side){
        return 4*side;
    }
    static double rectangle(double l, double b){
        return 2*(l+b);
    }static double parallelogram(double l, double b){
        return 2*(l+b);
    }
    static double circle(double r)
    {
        return 2*3.14*r;
    }
    static double equiTriangle(double side){
        return 3*side;
    }
}
