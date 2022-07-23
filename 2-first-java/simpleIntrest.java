import java.util.Scanner;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float p,r,t;
        System.out.println("Enter principle, rate, time :");
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();

        float si =(p*r*t)/100;
        System.out.println("Simple Intrest is "+si+"rs");
    }
}
