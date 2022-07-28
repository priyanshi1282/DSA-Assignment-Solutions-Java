import java.util.Scanner;

// LCM Of Two Numbers
public class Ilcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int max= num1>=num2? num1:num2;
        int lcm=0;
        int x=max;


        while (num1!=0)
        {
            if (max%num1==0 && max%num2==0){
                lcm=max;
                break;
            }
               max=max+x;
        }
        System.out.println(lcm);
    }
}
