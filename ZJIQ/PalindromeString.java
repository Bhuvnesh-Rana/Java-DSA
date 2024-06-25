package ZJIQ;

public class PalindromeString {
    public static void main(String[] args) {
        String a = "Appa";
        StringBuffer sb = new StringBuffer(a);
        StringBuffer rev = sb.reverse();

        if (a.equalsIgnoreCase(rev.toString())) {
            System.out.println("Is a palindrome.");
        }
        else{
            System.out.println("Is not a palindrome.");
        }
    }
}
