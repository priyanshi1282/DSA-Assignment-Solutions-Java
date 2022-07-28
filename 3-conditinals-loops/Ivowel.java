import java.util.Scanner;

// Java Program Vowel Or Consonant
public class Ivowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().trim().charAt(0);
        switch (ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'U':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
