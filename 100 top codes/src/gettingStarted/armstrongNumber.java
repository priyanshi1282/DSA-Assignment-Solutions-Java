package gettingStarted;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();

        int digit= getdigit(num);
//        using loop
    }
    private static int getdigit(int num){
        int count=(int)(Math.log10(num) +1);
        return count;
    }
}
