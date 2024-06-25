package ZJIQ;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 12;
        boolean flag = false;
    
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                flag = true;
                System.out.println("First divisible factor found: "+i);
                break;
            }    
        }
        if (flag) 
            System.out.println("Given no. is not prime no.");
        else
            System.out.println("Given no. is a prime no.");
    }
}
