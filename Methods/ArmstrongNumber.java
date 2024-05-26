package Methods;

// import java.util.Scanner;

public class ArmstrongNumber {      //153 - cube each digit then add .. should be number itself.
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a no.");
        // int a = sc.nextInt();
        for(int i=100;i<1000;i++){
            if (armno(i)) {
                System.out.print(i+" ");
            } 
            
        }
        // boolean result = armno(a);
        // System.out.println(result);

    }
    static boolean armno(int a){
        int originalNumber=a;
        int result=0;
        while (a>0) {
            int r=a%10;
            result = result+(r*r*r);
            a=a/10;
        }

        return result == originalNumber ;
    }
}
