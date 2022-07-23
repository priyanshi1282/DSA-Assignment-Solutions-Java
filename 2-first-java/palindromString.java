import java.util.Scanner;

// o find out whether the given String is Palindrome or not.
public class palindromString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        int i;
        for ( i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
                break;
        }

        if(i==str.length())
            System.out.println("Paliindrome");
        else
            System.out.println("Not Palindrome");
    }
}
