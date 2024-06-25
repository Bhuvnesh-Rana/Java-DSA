package ZJIQ;

public class NumberOfDigitsOddEven {
    public static void main(String[] args) {
        int num = 12345;
        int evenCount = 0;
        int oddCount = 0;

        while (num != 0) {
            if ((num % 10) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: "+oddCount);
    }
}
