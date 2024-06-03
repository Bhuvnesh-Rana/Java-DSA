public class CeilingOfANumber {
    public static void main(String[] args) {
        int a[]={4,10,16,24,33,49,50};
        int target = 50;
        int result = ceiling(a, target, 0, a.length-1);
        System.out.println(result);

    }
//ceiling is : smallest element in array >= target. if target not present, the result in next element.
    static int ceiling(int a[], int target, int s, int e){
        if (target>a[a.length-1]) {
            return-1;
        }
        while (s<=e) {
            int mid = (s+e)/2;

            if (a[mid]==target) {
                return mid;
            }
            else if (a[mid]>target) {
                e=mid-1;
            }
            else if(a[mid]<target){
                s=mid+1;
            }
        }
        return a[s];
    }

}
