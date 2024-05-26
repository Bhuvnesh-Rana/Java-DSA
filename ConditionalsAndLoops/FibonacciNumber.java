package ConditionalsAndLoops;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. to find fibonacci of..");
        int num = sc.nextInt();
        int f=0;

        for(int i=0;i<num;i++){
            f=i+i+1;
        }
        System.out.println(f);
    }
}
