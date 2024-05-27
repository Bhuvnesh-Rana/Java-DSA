package LinearSearch;

public class Searching {
    public static void main(String[] args) {
        int a[]={1,23,4,5};
        
        System.out.println("Result is: " +linearSearch(a,4));
    }
    static int linearSearch(int a[], int target){
        if (a==null) {
            return -1;
        }
        for(int i=0;i<a.length;i++){
            if (a[i]==target) {
                return i;
            }            
        }
        return -1;

    }
}
