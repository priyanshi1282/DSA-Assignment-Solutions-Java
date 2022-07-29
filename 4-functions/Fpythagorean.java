import java.util.Scanner;

// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
public class Fpythagorean {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("is a triplet "+ isPythagorean(a,b,c));
    }
    static boolean isPythagorean(int a, int b, int c){
        int h= max(a,b,c);
        h=h*h;
        int sum = a*a + b*b + c*c;
        sum= sum-h;
        if (h==sum)return true;
        return false;
    }
    static int max(int a, int b, int c){
        int temp = a>b? a:b;
        return temp>c? temp:c;
    }
}
