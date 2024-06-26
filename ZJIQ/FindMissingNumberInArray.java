package ZJIQ;

public class FindMissingNumberInArray {
    public static void main(String args[]){

        //REQUIREMENTS TO BE FULFILLED:-
        // no duplicate elements allowed in the array.
        // array need not to be sorted.
        // get the range of the array eg:- range for below array is 1 to 6.
        
        int a[] = {1,2,3,5,6};
        int sumOfArray = 0;
        int totalSum = 0;

        for(int i = 1; i <= a[a.length - 1]; i++){
            totalSum = totalSum + i;
        }
        for(int s : a){
            sumOfArray = sumOfArray + s;
        }
        System.out.println(totalSum);
        System.out.println(sumOfArray);
        System.out.println("Missing number is: "+(totalSum-sumOfArray));
    }
}
