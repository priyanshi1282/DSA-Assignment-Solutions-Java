package gettingStarted;

import java.util.Scanner;

public class palindromNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        String str= sc.next();
        int n= str.length();
        int num= getNum(str);
        int i;


//        simple for loop, when string is given
        for (i=0;i<n/2;i++)
            if (str.charAt(i)!=str.charAt(n-1-i))
            {
                System.out.println("no");
                break;
            }

        if (i==n/2)
            System.out.println("yes");


//        when integer is given, reverse the number to check.
        int rev=0; int temp= num;
        while (temp!=0)
        {
            rev= rev*10 + temp%10;
            temp/=10;
        }
        if (num==rev)
            System.out.println("yes");
        else
            System.out.println("no");
    }

//    convert string into number
    private static int getNum(String str)
    {
        int n= str.length();
        int num=0;
        for (int i=0;i<n;i++)
        {
            num = num*10 + (int)(str.charAt(i)-'0');
        }
        return num;
    }
}
