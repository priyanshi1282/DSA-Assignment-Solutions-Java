import java.util.Scanner;

// Compound Interest Java Program
public class IcompoundIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double amount, principal,r,t;
        System.out.println("enter p,r,t:");
        principal=sc.nextDouble();
        r= sc.nextDouble();
        t= sc.nextDouble();
        double temp= Math.pow(1+ r/100.0, t);
        amount=principal*temp;
        System.out.println(amount-principal);
    }
}
