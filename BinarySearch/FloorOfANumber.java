public class FloorOfANumber {
    public static void main(String[] args) {
        int a[]={4,10,16,24,33,49,50};
        int target = 15;
        int result = floor(a,target,0,a.length-1);
        System.out.println(result);
    }
// greatest element in the array <= target. if target not present return element one index back.
    static int floor(int a[],int target, int s,int e){
        while (s<=e) {
            int mid = (s+e)/2;
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
        return a[e];
    }
}
