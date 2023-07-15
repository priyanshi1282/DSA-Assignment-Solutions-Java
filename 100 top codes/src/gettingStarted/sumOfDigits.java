package gettingStarted;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num= sc.nextInt();
        System.out.print("enter a number in string form : ");
        String number= sc.next();

//      using brute force approach
        int sum=0;
        int temp= num;
        while(temp!=0)
        {
            sum+=(temp%10);
            temp/=10;
        }

        System.out.println(sum);


//      using recursion-1
        System.out.println(sum(num));

//      using ascii values for string input
        sum=0;
        for(int i=0;i<number.length();i++)
        {
            sum+= (int)(number.charAt(i)-'0');
        }
        System.out.println(sum);

    }

    private static int sum(int num){
        if(num==0)
            return 0;
        return num%10 + sum(num/10);
    }

}
