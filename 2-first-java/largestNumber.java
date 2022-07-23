import java.util.Scanner;

// Take 2 numbers as input and print the largest number.
public class largestNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>b)
            System.out.println(a);
        else if(a==b)
            System.out.println("equal numbers");
        else
            System.out.println(b);
    }
}
