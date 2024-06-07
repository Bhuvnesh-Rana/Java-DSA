package Recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 6) {       //Base condition
            return;
        }
        System.out.println(n);
        print(n+1);         //recursion call
    }
}
