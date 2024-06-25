package ZJIQ;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int a = 4;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i <= a; i++) {
            sum = num1 + num2;
            System.out.println(sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
