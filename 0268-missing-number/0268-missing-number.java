class Solution {
    public int missingNumber(int[] nums) {
        // for(int i =0;i<nums.length ;i++){
            int n= nums.length;

        int mis = (n*(n+1))/2;
        int sum =0;
        for(int num: nums){
            sum+=num;
        }
        
        
    
    return mis-sum; 
    }
}