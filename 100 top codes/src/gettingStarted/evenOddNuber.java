package gettingStarted;

import java.util.Scanner;

public class evenOddNuber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num= sc.nextInt();

//        using ternary operator
        String ans= (num % 2 == 0) ?"even":"odd" ;
        System.out.println(ans);

//        using bitwise operator
        if((num & 1) == 1)
            System.out.println("odd");
        else
            System.out.println("even");

    }
}
