import java.util.Scanner;

// To calculate Fibonacci Series up to n numbers.
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter position :");
        int n= sc.nextInt();
        long a=0L, b=1L,f=0L;
        for(int i=1; i<n;i++)
        {
            f=b+a;
            a=b;
            b=f;
        }
        System.out.println(f);
    }
}
