package gettingStarted;

import java.util.Scanner;

public class sumUpToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N : ");
        int n= sc.nextInt();

//        using for loop
        int ans=0;
        for(int i=1;i<=n;i++)
            ans+=i;

        System.out.println(ans);

//        using formula
        ans = n*(n+1)/2;
        System.out.println(ans);

//        using recursion
        System.out.println(sum(n));

    }

    public static int sum(int n){
        if(n==0)
            return 0;
        return sum(n-1)+n;
    }
}
