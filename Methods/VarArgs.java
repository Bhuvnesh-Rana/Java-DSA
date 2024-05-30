package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        va(1,4,6,23,4,5);
    }
    static void va(int ...a){   //can have multiple parameter inputs which will be stored in an Array.
        System.out.println("First element: "+a[0]);
        System.out.println(Arrays.toString(a));
    }
}
