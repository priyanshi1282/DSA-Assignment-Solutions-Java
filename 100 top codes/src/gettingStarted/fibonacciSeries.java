package gettingStarted;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter nth value : ");
        int n= sc.nextInt();

//        using loop
        int first=0;
        int second=1;
        int next=0;
        if (n==1)
            System.out.println("0");
        else if (n==2)
            System.out.println("0 1");
        else
        {
            System.out.print("0 1 ");
            for (int i=3;i<=n;i++)
            {
                next=first+second;
                first=second;
                second=next;
                System.out.print(next+" ");
            }
            System.out.println();
        }


//        using recursion
        System.out.println(series(n));

    }
    private static int series(int n){
        if (n==1)
            return 0;
        if (n==2)
            return 1;

        return series(n-1)+series(n-2);
    }
}
