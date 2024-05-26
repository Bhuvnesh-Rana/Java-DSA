package ConditionalsAndLoops;

import java.util.Scanner;

public class NumberOccurenceWithoutArray {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.: ");
        int num = sc.nextInt();
        int count=0;
        System.out.println("Enter no. whose count you want to check..");
        int check = sc.nextInt();

        while(num>0){
            int rem = num%10;       //to get last digit.
            if (rem == check) {
                count++;
            }
            num = num/10;           //to remove last digit.
            // System.out.println(num);
        }
        System.out.println("No. of occurence of "+check+" is: "+count);
    }
    
}
