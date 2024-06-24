package ZJIQ;

public class ReverseANumber {
    public static void main(String[] args) {
        int a = 1234;
        System.out.println("No. before reversing: "+a);

        // MTHD 1
        int b = 0;
        while (a!=0) {
            b = b * 10 + a % 10;
            a = a / 10;

        }
        System.out.println("No. after reversing: "+b);

        //MTHD 2 using reverse mthd.
        StringBuilder sb = new StringBuilder(String.valueOf(a));
        StringBuilder rev = sb.reverse();
        System.out.println("No. after reversing: "+rev);

        // MTHD 3 USING STRING BUFFER reverse method.
    }
}
