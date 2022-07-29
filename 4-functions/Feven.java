import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.
public class Feven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enert number");
        int a= sc.nextInt();
        System.out.println("is even "+isEven(a));
    }
    static boolean isEven(int a){
        return a%2==0;
    }
}
