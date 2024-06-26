package ZJIQ;

public class MaxMinElementsInArray {
    public static void main(String[] args){
        int a[] = {4,2,12,44,22};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println(max+" : "+min);
        for(int i = 0; i <= a.length - 1; i++){
            if (a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        }
        System.out.println("Maximum element in the array is: "+max);
        System.out.println("Minimum element in the array is: "+min);
    }
}
