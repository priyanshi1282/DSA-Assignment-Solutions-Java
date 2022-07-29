import java.util.Scanner;

// Define a method to find out if a number is prime or not.
public class Fprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("is prime "+isPrime(num));
    }
    static boolean isPrime(int num){
        if (num<2)
            return false;
        int i=2;
        for(;i*i<=num;i++){
            if (num%i==0)
                return false;
        }
        return true;
    }
}
