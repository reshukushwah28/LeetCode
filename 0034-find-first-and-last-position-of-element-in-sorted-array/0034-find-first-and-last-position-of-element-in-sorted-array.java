class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = Lower(nums, target);
        int last = Upper(nums, target)-1;
        if(first == nums.length || nums[first] != target){
            return new int[]{-1,-1};

        }
        return new int[]{first, last};
        
    }
    public int Lower(int[]nums , int target){
        int l = 0 ;
        int r = nums.length-1;
        int ans = nums.length;
        while(l<= r){
            int mid = l +(r-l)/2;
            if(nums[mid] >= target){
                ans = mid;
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return ans ;
    }

public int Upper(int[]nums , int target){
        int l = 0 ;
        int r = nums.length-1;
        int ans = nums.length;
        while(l<= r){
            int mid = l +(r-l)/2;
            if(nums[mid] > target){
                ans = mid;
                r = mid-1;
            }
            else {
                l = mid+1;
            }
        }
        return ans; 
    }
}