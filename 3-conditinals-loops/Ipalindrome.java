import java.util.Scanner;

// Find if a number is palindrome or not
public class Ipalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num,rev=0;
        while (num!=0){
            rev= rev*10 + num%10;
            num=num/10;
        }
        if (temp==rev)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
