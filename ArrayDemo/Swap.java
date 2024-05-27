package ArrayDemo;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a[]={1,2,4,7,5,9,22,14};
        System.out.println("Before swap: "+Arrays.toString(a));
        swap(a, 2, 5);
        System.out.println("After swapping: "+Arrays.toString(a));
        reverse(a);
        System.out.println("After reversing: "+Arrays.toString(a));
    }
    static void swap(int a[], int p1, int p2){
        int temp =a[p1];
        a[p1]=a[p2];
        a[p2]=temp;
    }
    static void reverse(int a[]){
        int start = 0;
        int end = a.length-1;
        while (start<end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }
}
