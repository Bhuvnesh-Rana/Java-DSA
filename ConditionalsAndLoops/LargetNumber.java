package ConditionalsAndLoops;

import java.util.Scanner;

public class LargetNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total no.s you want to compare.");

            
            int num = sc.nextInt();
            int a[] = new int[num];

            for(int i=0;i<num;i++){
                System.out.println("Enter number at index: "+i);
                a[i] = sc.nextInt();
            }
            System.out.println("Entered no.s are: ");
            for (int i : a) {
                System.out.println(i);
            }
            int max=a[0];
            for(int i=0;i<num-1;i++){
                if (a[i+1]>a[i]) {
                    max=a[i+1];
                }
                else
                max=a[i];
            }
            System.out.println("Maximum number is: "+max);
        }
        System.out.println("Using math class.");
        int max1 = Math.max(24, Math.max(30, 67));
        System.out.println("Maximum using math class: "+max1);
    }
}
