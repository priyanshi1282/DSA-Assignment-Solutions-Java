package gettingStarted;

import java.util.Scanner;

public class primeNumberInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rangr for prime numbers [a,b] : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a>b)
            System.out.println("enter valid range");
        else
        {
            for (;a<=b;a++)
            {
                if(isPrime(a))
                    System.out.print(a+" ");
            }
        }


    }


    private static boolean isPrime(int num){
        if (num<2)
            return false;
        if (num==2)
            return true;
        if (num%2==0)
            return false;
        for (int i=3;i*i<num;i+=2)
            if (num%i==0)
                return false;

        return true;
    }
}
