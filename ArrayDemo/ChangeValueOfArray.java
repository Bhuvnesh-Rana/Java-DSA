package ArrayDemo;

import java.util.Arrays;

public class ChangeValueOfArray {
    static int change(int arr[]){
        arr[1]=99;
        return arr[1];
    }
    public static void main(String[] args) {
        int a[]={4,10,2,7};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
        
    }
    
}
