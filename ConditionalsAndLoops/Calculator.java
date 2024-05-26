package ConditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int ans = 0;

        while (true) {
            System.err.print("Enter operation: ");
            char op = sc.next().charAt(0);
            
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.println("Enter the no.s");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op=='+') 
                    ans = num1+num2;
                if (op=='-') 
                    ans = num1-num2;
                if (op=='*') 
                    ans = num1*num2;
                if (op=='/') 
                    ans = num1/num2;
                if (op=='%') 
                    ans = num1%num2;
            }
                else if (op=='X' || op=='x'){
                    System.out.println("Closing calculator.");
                    break;
                }
            
            else
                System.out.println("Invalid operation.");

                System.out.println("Answer is: "+ans);
        }
    }
}
