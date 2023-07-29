package gettingStarted;

import java.util.Scanner;

public class armstrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter range [a,b] : ");
        int a= sc.nextInt();
        int b= sc.nextInt();

        if (b<a)
            return;

        while (a<=b){
            int temp= a;
            int sum=0;
            int len= getLength(temp);
            while (temp!=0)
            {
                sum+= Math.pow(temp%10, len);
                temp/=10;
            }
            if (sum==a)
                System.out.print(a+ " ");
            a++;
        }

    }
    private static int getLength(int num){
        return (int)(Math.log10(num)+1);
    }
}
