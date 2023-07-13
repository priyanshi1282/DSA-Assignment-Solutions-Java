package gettingStarted;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter year : ");
        int year= sc.nextInt();

//        using if else
        if(year%400==0)
            System.out.println("yes");
        else if(year%4==0 && year%100!=0)
            System.out.println("yes");
        else
            System.out.println("no");

//        using tarnary operator
        boolean isLeap= (year%400==0)?true:(year%4==0 && year%100!=0)?  true: false;
        System.out.println(isLeap);

    }
}
