package ConditionalsAndLoops;

public class Fibonacci {
    public static void main(String[] args) {
        fib(10);
    }
    
    static void fib(int n){
        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i < n; i++){
            System.out.print(num1 + " ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
