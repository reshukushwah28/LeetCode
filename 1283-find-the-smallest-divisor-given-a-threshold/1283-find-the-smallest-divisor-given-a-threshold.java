class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1 ;
        int high = Arrays.stream(nums).max().getAsInt();
        while(low <= high){
            int mid = low+(high - low)/2;
            if(help(nums,mid)<= threshold){
                high = mid-1;
            }
            else{
                low= mid+1;
            }
        }
            return low;
        
        
    }
    public int help(int nums[] , int element){
            int sum =0;
            
            for(int num : nums){
                double dig  = Math.ceil((double)num/element);
                sum+= dig;

            }
            return sum;
        }
}