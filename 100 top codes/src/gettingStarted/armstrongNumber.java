package gettingStarted;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();

        int temp= num;
        int sum=0;
        int digit= getdigit(num);
//        using loop
        while (temp!=0)
        {
            sum+= Math.pow(temp%10, digit);
            temp/=10;
        }
        if (sum==num)
            System.out.println("yes");
        else
            System.out.println("no");

//        using recursion
        sum= armStrongSum(num, digit);
        if (sum==num)
            System.out.println("yes");
        else
            System.out.println("no");

    }
    private static int getdigit(int num){
        int count=(int)(Math.log10(num) +1);
        return count;
    }
    private static int armStrongSum(int num, int len){
        if (num==0)
            return 0;
        return (int)Math.pow(num%10, len) + armStrongSum(num/10, len);
    }
}
