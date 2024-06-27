package ZJIQ;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {4,2,1,12,44,52,20};
        int target = 12;
        search(a, target);

    }
    static void search(int a[], int target){
        boolean flag = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] == target){
                System.out.println("Element "+target+" found at index "+i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Element not found.");
        }
    }
}
