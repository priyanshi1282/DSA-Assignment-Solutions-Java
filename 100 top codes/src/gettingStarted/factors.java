package gettingStarted;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter num : ");
        int num= sc.nextInt();

//        using loop
        System.out.print(1+" ");
        for (int i=2;i<=num/2;i++)
        {
            if (num%i==0)
                System.out.print(i+" ");
        }
        System.out.println(num);
    }
}
