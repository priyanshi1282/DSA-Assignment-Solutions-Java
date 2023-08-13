package gettingStarted;

import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num= sc.nextInt();

        int sum=0;
        int temp= num;
        while (temp!=0)
        {
            sum+= temp%10;
            temp/=10;
        }
        if (num%sum==0)
            System.out.println("yes");
        else System.out.println("no");

    }
}
