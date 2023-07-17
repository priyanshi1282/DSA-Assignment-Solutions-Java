package gettingStarted;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num= sc.nextInt();

//        while loop
        int temp=num;
        int rev=0;
        while (temp!=0)
        {
            rev= rev*10 + (temp%10);
            temp/=10;
        }
        System.out.println(rev);

//        using recursion
        System.out.println(reverse(num,0));
    }

    private static int reverse(int num, int rev){
        if (num == 0)
            return rev;
        rev=rev*10 + (num%10);
        return reverse(num/10,rev);

    }
}
