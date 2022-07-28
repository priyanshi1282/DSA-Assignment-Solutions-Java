import java.util.Arrays;
import java.util.Scanner;

// Calculate Distance Between Two Points
public class Idistance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter [x1, y1] : ");
        int[] p1= new int[2];
        getPoints(p1);

        System.out.print("Enter [x2, y2] : ");
        int p2[]= new int[2];
        getPoints(p2);
        System.out.println("Point p1"+ Arrays.toString(p1));
        System.out.println("Point p2"+ Arrays.toString(p2));

        System.out.println("distance is "+ calDistance(p1,p2));

    }
    static double calDistance(int[] p1, int[] p2){
        int x= p2[0]-p1[0];
        int y= p2[1]-p1[1];
        double dis= Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return dis;
    }
    static void getPoints(int[] p){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<2;i++)
            p[i]= sc.nextInt();
    }
}
