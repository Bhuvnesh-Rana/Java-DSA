import java.util.Arrays;

public class FirstAndLastPositionLC {
    public static void main(String[] args) {
        int a[] = {1,4,6,6,6,18,22,24,30,44};
        int target =6;
        int[] result = searchRange(a,target);
        System.out.println(Arrays.toString(result));
    }
// Q. Given an sorted array find the starting and ending position of a target value.
// if no element then return {-1,-1}
public static int[] searchRange(int[] nums, int target) {

    int[] ans = {-1, -1};
    // check for first occurrence if target first
    ans[0] = search(nums, target, true);
    if (ans[0] != -1) {
        ans[1] = search(nums, target, false);
    }
    return ans;
}

// this function just returns the index value of target
static int search(int[] nums, int target, boolean findStartIndex) {
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end) {
        // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
        int mid = start + (end - start) / 2;

        if (target < nums[mid]) {
            end = mid - 1;
        } else if (target > nums[mid]) {
            start = mid + 1;
        } else {
            // potential ans found
            ans = mid;
            if (findStartIndex) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return ans;
}
    
}
