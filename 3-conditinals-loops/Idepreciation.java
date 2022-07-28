import java.util.Scanner;

// Calculate Depreciation of Value
public class Idepreciation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter amount : ");
        double amount= sc.nextDouble();
        System.out.print("enter useful life(years) : ");
        int years= sc.nextInt();
        System.out.print("enter residual value : ");
        double value= sc.nextDouble();
        System.out.println("ans "+ calDep(amount,value,years)+"rs");
    }
    static double calDep(double amt, double val, int year){
        double ans =(amt-val)/10;
        return ans;
    }
}
