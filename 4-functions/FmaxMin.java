import java.util.Scanner;

// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class FmaxMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("max is"+max(a,b,c));
        System.out.println("min is"+min(a,b,c));
    }
    static int max(int a, int b, int c){
        int temp = a>b? a:b;
        return temp>c? temp:c;
    }  static int min(int a, int b, int c){
        int temp = a<b? a:b;
        return temp<c? temp:c;
    }
}
