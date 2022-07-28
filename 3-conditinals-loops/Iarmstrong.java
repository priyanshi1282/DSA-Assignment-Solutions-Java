import java.util.Scanner;

// Armstrong Number In Java
public class Iarmstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int power= digits(num);
        int temp=num;
        int arm=0;
        while (num!=0){
            arm= arm + (int)Math.pow(num%10, power);
            num/=10;
        }

        if(temp==arm)
            System.out.println("yes");
        else
            System.out.println("no");
    }
    static int digits(int num){
//        int count=0;
//        if (num==0)
//            return 1;
//        while (num!=0)
//        {
//            count++;
//            num/=10;
//        }
//        return count;
        int count= (int)Math.log10(num)+1;
        return count;
    }
}
