//WHEN YOU DON'T KNOW THE ORDER OF SORTED ARRAY(ASC. OR DESC.)
public class OrderAgnosticBS {
    public static void main(String[] args) {
        int a[]={44,30,25,22,16,10,4};      //desc array
        // int b[]={1,3,5,7,15,16};            // asc array
        int target = 16;
        int result = oABinarySearch(a, target, 0, a.length-1);
        System.out.println(result);

    }
    static int oABinarySearch(int a[],int target, int start, int end){
         if (a[start]>a[end]) {      // {44,30,25,22,16,10,4}
            
            while (start<=end) {
                int mid = (start + end)/2;
                if (a[mid]==target) {
                    return mid;
                }
                else if (a[mid]>target) {
                    start = mid+1;
                }
                else if (a[mid]<target) {
                    end = mid-1;
                }
            }
         }
        else{
            while (start<=end) {
                int mid = (start+end)/2;      //optimised   mid = s + (e - s) / 2;
                if (a[mid]==target) {
                    return mid;
                }
                else if (a[mid]>target) {
                    end=mid-1;
                }
                else if (a[mid]<target) {
                    start=mid+1;
                }
        }
    }
    return -1;
    }

}
