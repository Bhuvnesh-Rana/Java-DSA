
public class PrimeNumberOptimized {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i +" : "+isPrime(i));
        }
    }

    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int a = 2;
        while (a * a <= n) {        //no. get repeated i.e. 2*3 = 6 and 3*2 = 6
            if (n % a == 0) {
                return false;
            }
            a++;
        }
        return true;
    }
    
}