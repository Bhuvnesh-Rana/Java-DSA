package ZJIQ;

public class PalindromeDigit {
    public static void main(String[] args) {
        int a = 1224221;
        int a1 = a;
        int b = 0;

        while (a != 0) {
            b = (b * 10) + a % 10;
            a = a / 10;
        }
        if (a1 == b) {
            System.out.println("No. is a palindrome");
        } else {
            System.out.println("No. is not a palindrome.");
        }
        
    }
}
