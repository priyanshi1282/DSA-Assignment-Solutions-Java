package gettingStarted;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num= sc.nextInt();


//        using loop
        int sum=0;
        int temp=num;
        while (temp!=0)
        {
            sum = sum + getFactorial(temp%10);
            temp/=10;
        }
        if (sum==num)
            System.out.println("yes");
        else System.out.println("no");

    }
    private static int getFactorial(int num){
        int ans=1;
        if (num==0 || num==1)
            return ans;
        for (int i=2;i<=num;i++)
            ans*=i;
        return ans;
    }
}
