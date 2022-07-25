import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all
public class Blargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        int max= Integer.MIN_VALUE;
        do {
            num= sc.nextInt();
            if (max<num)
                max=num;
        }while(num!=0);
        System.out.println(max);
    }
}
