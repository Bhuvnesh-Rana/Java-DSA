package ArrayDemo;

import java.util.Arrays;

public class SearchingInRange {
    public static void main(String[] args) {
        int a[]={1,4,7,2,5,8,34,56,87};
        System.out.println(Arrays.toString(a));
        boolean result = search(a, 99, 1, 6);
        System.out.println(result);
    }
    static boolean search(int a[], int target, int start, int end){
        if (a==null) {
            return false;
        }
        for(int i=start;i<end;i++){
            if (a[i]==target) {
                return true;
            }
        }

        return false;
    }
}
