package ZJIQ;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {4,10,12,14,22,103,111,121,122,125};
        int target = 2;
        int ans = search(a, target);
        
        if (ans != -1) 
            System.out.println("Element is present in index: "+ans);    
        else
            System.out.println("Element not present.");
        
        

    }
    static int search(int a[], int target){
        int s = 0;
        int e = a.length - 1;

        while (s <= e) {

        int mid = (s+e) / 2;

        if (a[mid] == target) {
            return mid;
        }
        else if (a[mid] > target) {
            e = mid - 1;
        }
        else if (a[mid] < target) {
            s = mid + 1;
        }
        }
        return -1;
    
    }
}