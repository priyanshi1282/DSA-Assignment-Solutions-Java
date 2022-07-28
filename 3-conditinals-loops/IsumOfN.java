import java.util.Scanner;

// Sum Of N Numbers
public class IsumOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0,n,num;
        System.out.println("enter n ");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            num= sc.nextInt();
            sum+=num;
        }
        System.out.println(sum);
    }
}
