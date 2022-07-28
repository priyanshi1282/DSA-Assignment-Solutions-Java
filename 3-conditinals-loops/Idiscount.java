import java.util.Scanner;

// Calculate Discount Of Product
public class Idiscount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter MRP of product : ");
        double mrp= sc.nextDouble();
        System.out.print("Enter offer in % : ");
        double offer = sc.nextDouble();
        double result = discount(mrp, offer);
        System.out.println("Discount is of "+result+"rs");
        System.out.println("Price after discount is "+(mrp-result)+"rs");
    }

    static double discount(double mrp, double offer){
        double result=(mrp*offer)/100;
        return  result;
    }
}
