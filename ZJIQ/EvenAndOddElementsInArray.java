package ZJIQ;

public class EvenAndOddElementsInArray {
    public static void main(String[] args) {
        int a[] = {4,2,5,7,1,12,44,97,100};

        System.out.println("Even numbers in the array are: ");
        for(int i = 0; i <= a.length - 1; i++){
            if (a[i] % 2 == 0) {
                System.out.print(a[i]+" ");
            }
        }

        System.out.println();
        System.out.println("Odd numbers in the array are: ");
        for(int i = 0; i <= a.length - 1; i++){
            if (a[i] % 2 != 0) {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
}
