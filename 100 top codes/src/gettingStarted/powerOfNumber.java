package gettingStarted;

import java.util.Scanner;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter base and exponent [a,b] : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;

        if(b<0)
        {
            System.out.println("invalid");
            return;
        }

//        using formula
        System.out.println(Math.pow(a,b));


//        using a loop
       for (int i=1;i<=b;i++)
       {
           ans*=a;
       }
        System.out.println(ans);

//        using recursion
        System.out.println(power(a,b));
    }
    private static int power(int a, int b){
        if (b==0)
            return 1;
//        if (b>1)
//            return a;
        return a*power(a, b-1);
    }
}
