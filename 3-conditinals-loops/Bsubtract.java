import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class Bsubtract {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int ans =product(num) - sum(num);
        System.out.println(ans);
    }
    static int product(int n){
        int ans=1;
        if(n==0)
            return 0;
        while (n!=0){
            ans= ans * (n%10);
            n/=10;
        }
        return ans;
    }
    static int sum(int n){
        int ans=0;
        while (n!=0)
        {
            ans= ans +  n%10;
            n/=10;
        }
        return ans;
    }
}
