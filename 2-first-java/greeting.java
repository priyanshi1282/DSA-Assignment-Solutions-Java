import java.util.Locale;
import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.
public class greeting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr name :");
        String name = sc.nextLine().trim();
        System.out.println("Welcome dear "+ name);
    }
}
