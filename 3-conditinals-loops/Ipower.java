import java.util.Scanner;

// Power In Java
public class Ipower {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base and power :");
        int base= sc.nextInt();
        int power= sc.nextInt();
        System.out.println("Ans "+ power(base,power));
    }
    static int power(int b, int p){
        int res=1;
        while(p>0){
           res=res*b;
           p--;
        }
        return res;
    }
}
