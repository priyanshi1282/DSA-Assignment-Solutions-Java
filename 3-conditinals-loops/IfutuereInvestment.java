import java.util.Scanner;

// Future Investment Value
public class IfutuereInvestment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter present value ");
        double pv=sc.nextDouble();
        System.out.println("enter interest value ");
        double i= sc.nextDouble();
        System.out.println("enter years ");
        int n= sc.nextInt();

        double fv= pv* Math.pow(1+i/100,n);
        System.out.println(fv);
    }
}
