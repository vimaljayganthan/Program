import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

  
        int flag = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != rev.charAt(i)) {
                flag = 0;
                break;
            }
        }

   
        if (flag == 1)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}