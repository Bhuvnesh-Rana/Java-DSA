package LinearSearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int a[]={1,4,2,5,3,6,18,12};        //suppose array is infinite, can't use .length.
        int target =21;
        int result = ia(a, target);
        System.out.println(result);
        
    }
// infinite array can't use array.length 
    static int ia(int a[], int target){
        try {
            for(int i=0;i<i+1;i++){
                if (a[i]==target) {
                    return i;
                }
            }
        } catch (Exception e) {
            System.out.print("");
        }
       
        return -1;
    }
}
