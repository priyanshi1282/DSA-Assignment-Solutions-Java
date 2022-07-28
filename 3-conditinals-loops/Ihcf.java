import java.util.Scanner;

// HCF Of Two Numbers Program
public class Ihcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int hcf=0;
        int min = num1>=num2?  num2:num1;
        for(int i=1;i<=min;i++){
            if (num1%i==0 && num2%i==0)
                hcf=i;
        }
        System.out.println("hcf is "+hcf);
    }
}
