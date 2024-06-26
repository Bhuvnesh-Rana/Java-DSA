package ZJIQ;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {
    public static void main(String[] args){
        int a[] = {4,2,12,3,35};
        int b[] = {4,2,12,3,35};

// MTHD 1
        if (Arrays.equals(a, b)) {
            System.out.println("Arrays are equal.");
        }
        else{
            System.out.println("Arrays are not equal.");
        }

// MTHD 2
        boolean flag = true;
        if (a.length == b.length) {
            for(int i = 0; i <= a.length - 1; i++){
                if (a[i] != b[i]) {
                    flag = false;
                }
            }
        }
        else{
            flag = false;
        }
        if (flag) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
