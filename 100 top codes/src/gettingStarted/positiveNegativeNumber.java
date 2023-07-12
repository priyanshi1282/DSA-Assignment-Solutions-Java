package gettingStarted;

import java.util.Scanner;

public class positiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num= sc.nextInt();

        if(num==0)
            System.out.println("It's a Zero");
        else if(num>0)
            System.out.println("It's Positive");
        else
            System.out.println("It's Negative");

    }
}
