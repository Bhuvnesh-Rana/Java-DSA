package LinearSearch;

import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int a[][]={
            {1,2,3,4},
            {5,6,7},
            {8,9,10,11}
        };
        for (int[] is : a) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
        boolean result = search(a, 17);
        System.out.println("Element present: "+result);
        int[] result1 = search1(a, 9);
        System.out.println(Arrays.toString(result1));
    }
    static boolean search(int a[][], int target){
        if (a==null) {
            return false;
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if (a[i][j]==target) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] search1(int a[][], int target){
        if (a==null) {
            return new int[]{-1,-1};
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if (a[i][j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
