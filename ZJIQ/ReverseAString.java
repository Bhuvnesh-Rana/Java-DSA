package ZJIQ;

public class ReverseAString {
    public static void main(String[] args) {
        String a = "abcd";
        mthd1(a);
        mthd2(a);
        mthd3(a);
    }

// MTHD 1 USING FOR LOOP ON STRING
    static void mthd1(String a){
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println(b);
    }

// MTHD 2 USING FOR LOOP ON STEING CONVERTED TO CHAR ARRAY 
    static void mthd2(String a){
        String c = "";
        char []b = a.toCharArray();
        for (int i = b.length - 1; i >= 0; i--) {
            c = c + b[i];
        }
        System.out.println(c);
    }

// MTHD 3 USING STRING BUFFER REVERSE MTHD.
    static void mthd3(String a){
        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.reverse());
    }
}
