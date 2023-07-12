package gettingStarted;

import java.util.Scanner;

public class greatestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();

//        ternary operator
        int max= a>=b?a:b;
        System.out.println(max);


//        if else
        if (a>=b)
            System.out.println(a);
        else System.out.println(b);

//        inbuilt function
        System.out.println(Math.max(a,b));

    }
}
