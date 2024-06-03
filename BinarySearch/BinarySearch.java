public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hi");
        int a[]={1,4,6,8,11};
        int target = 12;
        int result = binarySearch(a, 0, a.length-1, target);
        System.out.println(result);
    }
//SORTED ARRAY
    static int binarySearch(int[] a, int s,int e, int target){
        while (s<=e) {
            
        
        int mid = (s+e)/2;      //optimised   mid = s + (e - s) / 2;
        if (a[mid]==target) {
            return mid;
        }
        else if (a[mid]>target) {
            e=mid-1;
        }
        else if (a[mid]<target) {
            s=mid+1;
        }
    }
    return -1;
}
}
