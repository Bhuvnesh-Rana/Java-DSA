package ZJIQ;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int a[] = {4,2,1,6,8};
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
