package gettingStarted;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number : ");
        int num= sc.nextInt();

//        using binary search
        int s=1, e=num;
        while (s<=e)
        {
            int mid= s+(e-s)/2;
            if (mid*mid==num)
            {
                System.out.println(mid + " yes");
                break;
            }
            else if (mid*mid>num)
                e=mid-1;
            else
                s=mid+1;
        }
        if (s>e)
            System.out.println("no");


//        using math function
        int floor=(int) Math.floor(Math.sqrt(num));
        int ceil=(int) Math.ceil(Math.sqrt(num));
        if (floor==ceil)
            System.out.println(floor+" yes");
        else System.out.println("no");
    }
}
