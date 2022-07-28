import java.util.Scanner;

// Find Ncr & Npr
public class Ipermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ncr,npr,n,r;
        System.out.println("enter n and r :");
        n= sc.nextInt();
        r= sc.nextInt();
        npr= findFact(n, n-r);
        ncr= npr/ findFact(r,0);

        System.out.println("nPr "+npr);
        System.out.println("nCr "+ncr);
    }
    static int findFact(int num, int end){
        int fact=1;
        for(int i=num;i>end;i--)
            fact=fact*i;

        return fact;
    }
}
