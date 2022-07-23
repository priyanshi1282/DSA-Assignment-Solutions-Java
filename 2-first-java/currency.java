import java.util.Scanner;

// Input currency in rupees and output in USD.
public class currency {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr rs :");
        double rs= sc.nextDouble();
        double usd =0.013 *rs;
        System.out.println(usd + "$");
    }
}
