package gettingStarted;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();

        if(num<2)
            System.out.println("Prime numbers are always greater than 1");
        else
        {
            checkPrime(num);
            checkPrime2(num);
            checkPrime3(num);
            checkPrime4(num);
            checkPrime5(num);
            checkPrime6(num, 3);

        }


    }

//    basic iterative method
    private static void checkPrime(int num){
        int factors=1;
        for(int i=2;i<=num;i++)
            if (num%i==0)
                factors++;

        if (factors>2)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }


//    improve iteration by break condition
    private static void checkPrime2(int num){
        int i=2;
        for(;i<num;i++)
            if (num%i==0)
                break;

        if (i==num)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

//    iterate for n/2 times
    private static void checkPrime3(int num)
    {
        for (int i=2;i<=num/2;i++)
            if (num%i==0)
            {
                System.out.println("not prime");
                return;
            }

        System.out.println("prime");
    }

//    all factors of number lie between [2, sqrt(num)]
    private static void checkPrime4(int num){
        for (int i=2;i*i<=num;i++)
            if (num%i==0)
            {
                System.out.println("not prime");
                return;
            }

        System.out.println("prime");
    }

//    by skipping even terms, if 2 is already checked, why to check for 4,6,8,10,12,14,...... and so.
    private static void checkPrime5(int num){
        if(num==2){
            System.out.println("prime");
            return;
        }
        if (num%2==0)
        {
            System.out.println("not prime");
            return;
        }


        for (int i=3; i*i<= num; i=i+2)
            if (num%i==0)
            {
                System.out.println("not prime");
                return;
            }

        System.out.println("prime");
    }

//    using recursion
    private static void checkPrime6(int num, int i){
        if (i>=num || num==2)
        {
            System.out.println("prime");
            return;
        }

        if (num%i==0 || num%2==0)
        {
            System.out.println("not prime");
            return;
        }
        checkPrime6(num,i+2);
    }

}
