import java.util.Scanner;

// Reverse A String In Java
public class IstringReverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char ch[]= str.toCharArray();
        for (int i=0;i<ch.length/2;i++){
            char temp= ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
     String newStr= new String(ch);
        System.out.println(newStr);
    }
}
