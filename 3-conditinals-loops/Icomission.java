import java.util.Scanner;

// Calculate Commission Percentage
public class Icomission {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter amount : ");
        double amount= sc.nextDouble();
        System.out.print("Enter comission amount : ");
        double c_amount = sc.nextDouble();
        System.out.println("Commission rate is " + rate(amount,c_amount) + "%");
    }
    static double rate(double amount, double c_amount){
        double ans = (c_amount*100)/ amount;
        return ans;
    }
}
