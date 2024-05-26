package Methods;

import java.util.Scanner;

public class Sum {
    static int sum(int a, int b){
        int result = a+b;
        return result;
    }

    static int[] swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        int a1[]={a,b};
        return a1 ;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first no. : ");
            int a = sc.nextInt();
            System.out.println("Enter second no. : ");
            int b = sc.nextInt();
            
            int result1 = sum(a,b);
            System.out.println("Sum is: "+result1);

            int []num = swap(4, 10);
            for (int i : num) {
                System.out.println(i);
            }
        }
    }
}
