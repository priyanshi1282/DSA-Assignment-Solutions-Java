package gettingStarted;

import java.util.Scanner;

public class sumOfRange {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter range [a,b] : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;

//        using brute force approach (for loop)
        for(int i=a;i<=b;i++)
            sum+=i;

        System.out.println(sum);

//        using formula
        int n= b-a+1;
        sum= (n)*(2*a + n-1)/2;

        System.out.println(sum);

//        using recursion
        System.out.println(sum(a,b));

    }
    private static int sum(int a, int b){
        if(b==a)
            return a;
        return sum(a,b-1)+b;
    }
}
