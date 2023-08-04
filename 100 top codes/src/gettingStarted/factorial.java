package gettingStarted;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();
        if (num<0)
        {
            System.out.println("invalid number");
            return;
        }
//        using for loop
        int fact=1;
        for (int i=2;i<=num;i++)
            fact*=i;
        System.out.println(fact);


//        using recursion
        System.out.println(getFact(num));
    }
    private static int getFact(int num){
        if (num==0 || num==1)
            return 1;
        return num*getFact(num-1);
    }
}
