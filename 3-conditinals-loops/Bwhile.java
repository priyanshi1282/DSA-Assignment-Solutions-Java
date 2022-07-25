import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Bwhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int sum=n;
        while (n!=0)
        {
            n=sc.nextInt();
            sum+= n;
        }
        System.out.println("sum is "+sum);
    }
}
