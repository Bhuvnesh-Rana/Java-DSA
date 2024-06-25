package ZJIQ;

public class LargestOfThreeNumbers {
    public static void main(String args[]){
        int a = 1200;
        int b = 41;
        int c = 242;
        max1(a, b, c);
        max2(a, b, c);
        
    }

// MTHD 1
    static void max1(int a, int b, int c){
        if (a > b && a > c) {
            System.out.println("Largest no. is a: "+a);
        }
        else if (b > a && b > c) {
            System.out.println("Largest no. is b: "+b);
        }
        else{
            System.out.println("Largest no. is c: "+c);
        }
    }

// MTHD 2 USING TERNARY.
    static void max2(int a, int b, int c){
        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("Largest no. is: "+largest);
    }
}
