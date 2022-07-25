import java.util.Scanner;

//Fibonacci Series In Java Programs
public class Bfibonaci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int position =sc.nextInt();
        System.out.println(fibo(position));
    }
    static int fibo(int pos){
        int a=0;
        int b=1;
        if (pos==0)
            return a;
        if (pos==1)
            return b;
        int temp=0;
        for(int i=2;i<=pos;i++){
        temp= b+a;
        a=b;
        b=temp;
        }
        return temp;
    }
}
