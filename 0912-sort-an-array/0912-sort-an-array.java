class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = n/2 -1; i>=0; i--){
            heapify(nums, n , i);

        }
        for(int i = n-1;i>0;i-- ){
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            heapify(nums, i , 0);
        }

return nums;

       
    }
    void heapify(int []nums,int n , int i ){
        int l  = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left < n && nums[left] > nums[l]){
            l = left;
        }
        if(right< n && nums[right] > nums[l]){
            l = right;
        }
        if(l != i){
            int temp = nums[i];
            nums[i] = nums[l];
            nums[l] = temp;
        
        heapify(nums, n , l);
        }
    }

}
// int n = arr.length;
// for(int i = 0; i<n-1;i++){
//     for(int j = 0;j<n-i-1;j++){
//         if( arr[j]>arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//         }
//     }
// }return arr;