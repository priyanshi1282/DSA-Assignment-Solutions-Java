package gettingStarted;

import java.util.Scanner;

public class primeFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();

//        using loop
        for (int i=2;i<=num;i++)
        {
            if (isPrime(i))
            {
                int temp= num;
                while (temp%i==0)
                {
                    System.out.print(i + " ");
                    temp/=i;
                }
            }
        }
    }
    static boolean isPrime(int num){
        for (int i=2;i<=Math.sqrt(num);i++)
            if (num%i==0)
                return false;
        return true;
    }
}
