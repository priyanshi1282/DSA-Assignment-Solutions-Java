import java.util.Scanner;

// Calculate Average Marks
public class IaverageMarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter marks of 5 subjects : ");
        double[] marks= new double[5];
        double sum=0;
        for (int i=0;i<5;i++){
            marks[i]=sc.nextDouble();
            sum+=marks[i];
        }
        System.out.println(sum/5);
    }
}
