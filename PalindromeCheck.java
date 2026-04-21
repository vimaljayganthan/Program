import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Normalize: remove spaces and convert to lowercase
        String cleaned = input.replaceAll(" ", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
    
}