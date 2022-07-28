import java.util.Scanner;

// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class IsumTill0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int neg=0,posE=0,posOdd=0;
        int num;
        do {
            num= sc.nextInt();
            if (num<0)
                neg+=num;
            else if(num%2==0)
                posE+=num;
            else
                posOdd+=num;
        }while (num!=0);
        System.out.println("negative "+neg);
        System.out.println("even "+posE);
        System.out.println("odd "+posOdd);
    }
}
