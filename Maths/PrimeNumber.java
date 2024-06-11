
public class PrimeNumber {
    public static void main(String[] args) {
        int n = 39;
        boolean flag = true;
        for(int i = 2; i < n; i++){
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("No. is prime.");
        }
        else
        System.out.println("No. is not prime.");
    }
    
}