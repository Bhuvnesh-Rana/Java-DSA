package ConditionalsAndLoops;

import java.util.Scanner;

public class CheckAlphabeCase {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a>='a' && a<='z') {
            System.out.println("LowerCase.");
        }
        else if(a>='A' && a<='Z')
            System.out.println("UpperCase.");

        else
            System.out.println("Invalid input.");
    }
}
