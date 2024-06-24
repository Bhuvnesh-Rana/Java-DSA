package ZJIQ;


public class Swapping {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Values before swapping: "+a+ "  "+b);

        //MTHD 1
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swapping: "+a+ "  "+b);

        //MTHD 2
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swapping: "+a+ "  "+b);

        // MTHD 3
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Values after swapping: "+a+ "  "+b);

        // MTHD 4
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Values after swapping: "+a+ "  "+b);

        // MTHD 5
        b = a + b - (a = b);
        System.out.println("Values after swapping: "+a+ "  "+b);
    }
    
}