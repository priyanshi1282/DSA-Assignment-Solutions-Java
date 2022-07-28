import java.util.Scanner;

// Calculate Average Of N Numbers
public class Iaverage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum + sc.nextInt();
        }
        System.out.println(sum/n);
    }
}
