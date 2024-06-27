package ZJIQ;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int a[] = {4,24,1,2,13,12,11,24,22,1,3,12};
        List<Integer> dup  = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if (a[i] == a[j]) {
                    dup.add(a[i]);
                }
            }
        }
        System.out.print("Duplicate elements in the array are:- ");
        System.out.println(dup);
    }
    
}