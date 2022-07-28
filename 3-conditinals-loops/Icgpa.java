import java.util.Scanner;

// Calculate CGPA Java Program
public class Icgpa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter makrs of 5 subject :");
        float[] marks= new float[5];
        for(int i=0;i<5;i++)
            marks[i]= sc.nextFloat();

        System.out.println("cgpa is "+ calc(marks));
    }
    static float calc(float[] marks){
        float per=0;
        for(float x: marks)
            per= per+x;

        per= (per/ marks.length);
        System.out.println("percentage is "+ per);
        return per/9.5f;
    }
}
