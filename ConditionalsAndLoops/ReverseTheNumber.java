package ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num = sc.nextInt();
        int revNum = 0;

        while (num>0) {
            revNum=revNum*10+num%10;
            num=num/10;
        }
        System.out.println(revNum);
    }
}
