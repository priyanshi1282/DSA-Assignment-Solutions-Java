import java.util.Scanner;

// Calculate Batting Average
public class Ibatting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter runs in an over : ");
        int[] runs= new int[6];
        for(int i=0;i<6 ;i++)
            runs[i]=sc.nextInt();

        System.out.println("average batting is "+ calAvg(runs));
    }
    static int calAvg(int[] runs){
        int res=0;
        for(int x:runs)
            res= res+x;
        return res/6;
    }
}
