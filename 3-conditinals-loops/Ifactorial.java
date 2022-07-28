import java.util.Scanner;

// Factorial Program In Java
public class Ifactorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long fact=1;
        long num=sc.nextLong();
        for(long i=2;i<=num;i++)
            fact=fact*i;

        System.out.println(fact);
    }
}
