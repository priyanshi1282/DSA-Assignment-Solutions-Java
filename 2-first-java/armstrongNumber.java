import java.util.Scanner;

// To find Armstrong Number between two given number.
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter start and end point : ");
        a=sc.nextInt();
        b=sc.nextInt();

        if(a<b){
            for (int i=a;i<=b;i++)
            {
                if(isArmstrong(i))
                    System.out.print(i+ " ");
            }
        }

    }

    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while (n>0){
            sum = (int) (sum + Math.pow(n%10, 3));
            n=n/10;
        }
        return original==sum;
    }
}
