package gettingStarted;

import java.util.Scanner;

public class automorphicNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num= sc.nextInt();
        int square = num*num;
        while (num!=0 && square!=0){
                if (num%10 != square%10){
                    System.out.println("no");
                    return;
                }
                num/=10;
                square/=10;
        }

        System.out.println("yes");
    }
}
