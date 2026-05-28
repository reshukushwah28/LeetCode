class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1); //poori array reverse kro 
        reverse(nums, 0 , k-1); //0 s leke k tk reverse kro 
        reverse(nums, k , n-1); // ab k s leke last tk reverse krdo 

        
    }
    public void reverse(int[] nums, int start, int end ){
        while(start<= end){
            int temp =nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}