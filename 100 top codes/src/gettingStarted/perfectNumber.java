package gettingStarted;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num=sc.nextInt();

        int sum=1;
        for (int i=2;i<=num/2;i++)
        {
            if (num%i==0)
                sum+=i;
        }
        if (sum==num)
            System.out.println("yes");
        else System.out.println("no");
    }
}
