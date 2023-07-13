package gettingStarted;

import java.util.Scanner;

public class greatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

//      using if else
        if (a>=b && a>=c)
            System.out.println(a);
        else if(b>=c && b>=a)
            System.out.println(b);
        else
            System.out.println(c);

//        using tarnary operator
        int max= (a>=b)?(a>=c)?a:c : (b>=c)?b:c;
        System.out.println(max);

    }
}
