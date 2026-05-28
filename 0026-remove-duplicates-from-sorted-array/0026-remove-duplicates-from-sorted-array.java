class Solution {
    public int removeDuplicates(int[] nums) {
        int k =1;
        //kuki peheli hi hme ek unique element mil gya h kuki array soted h to first element is always unique 
        for(int  i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];  
                k++;         }
        }
        return k;

        
    }
}