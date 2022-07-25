//        Volume Of Cone Java Program
//        Volume Of Prism
//        Volume Of Cylinder
//        Volume Of Sphere
//        Volume Of Pyramid
//        Curved Surface Area Of Cylinder
//        Total Surface Area Of Cube
public class Bmansturation {
    public static void main(String[] args) {
        System.out.println("volumn of cone : "+ cone(10,10));
        System.out.println("volumn of prism : "+ triPrism(10,10,10));
        System.out.println("volumn of cylinder : "+ cylinder(10,10));
        System.out.println("volumn of sphere : "+ spehre(10));
        System.out.println("volumn of pyramid : "+ pyramid(10,10,10));
        System.out.println("csa of cylinder : "+csacylinder(10,10));
        System.out.println("tsa of cube : "+ cube(10));
    }
    static double cube(double side)
    {
        return 6*side;
    }
    static double csacylinder(double r, double h){
        return 2*3.14*r*h;
    }
    static double pyramid(double height, double baseL, double baseW){
        return (height*baseL*baseW)/3;
    }
    static double spehre(double r){
        return 4*(3.14*r*r*r)/3;
    }
    static double cylinder(double r, double h){
        return 3.14*r*r*h;
    }
    static double triPrism(double base, double height, double lenght){
        return 0.5*base*height*lenght;
    }
    static double cone(double r, double h){
        return (3.14*r*r*h)/3.0;
    }
}
