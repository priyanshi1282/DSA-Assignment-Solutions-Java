import java.util.Scanner;

// Perfect Number In Java
public class IperfectNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=1;
        for (int i=2;i<=num/2; i++)
            if(num%i==0)
               sum+=i;

        System.out.println(num==sum);
    }
}
