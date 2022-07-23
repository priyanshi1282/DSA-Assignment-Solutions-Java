import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class mathsOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("enter choice : +, -, *, /, % :");
        char choice = sc.next().trim().charAt(0);

        int result =0;
        if(choice=='+')
            result =a+b;
        else if(choice=='-')
            result= a-b;
        else if(choice =='*')
            result=a*b;
        else if(choice=='/') {
            if (b != 0)
                result = a / b;
        }

        else if(choice=='%')
            result = a%b;
        else
                System.out.println("Enter valid choice...");

        System.out.println(result);

    }
}
