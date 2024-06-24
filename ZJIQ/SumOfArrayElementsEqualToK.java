package ZJIQ;

public class SumOfArrayElementsEqualToK {
    public static void main(String[] args) {
        int nums[]={-5,-1,2,7,11,15};
        int k=6;
        
        for(int i=0;i<=nums.length-1;i++){
            for(int j=0;j<=nums.length-1;j++){			
            if(nums[i]+nums[j]==k & nums[i]!=nums[j])
            System.out.println("Index of "+i+" + "+j+" = "+(nums[i]+nums[j]));
        }
        }
    }
}