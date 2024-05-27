package LinearSearch;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int []a={12,345,4674,242424,132}; 
        int result=findNumbers(a);
        System.out.println(result);
    }
    static int findNumbers(int []a){
        int count=0;
        for (int i : a) {
            if (isEven(i)) {
                count++;
            }
        }
        
        return count;
    }
    static boolean isEven(int num){
        int a = digits(num);
        if (a%2 ==0) {
            return true;
        }
        return false;
    }
    static int digits(int a){
        int count=0;
        while (a>0) {
            count++;
            a=a/10;
        }
        return count;
    }
}
