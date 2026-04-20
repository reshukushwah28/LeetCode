class Solution {
    public void sortColors(int[] nums) {
        // int n = nums.length;
        // for( int i =0; i<n - 1; i++){
        //     for(int j = 0;j <n-i-1 ; j++){
        //         if(nums[j ]> nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] =  nums[j+1];
        //             nums[j+1] =  temp;
        //         }
        //     }
        // }
    int l = 0;
    int r = nums.length -1;
    int mid = 0;
    while(mid <= r)
    {if( nums[mid] == 0 ){
        int temp= nums[l];
        nums[l]  = nums[mid];
        nums[mid] = temp;
        l++;
        mid++;


    }else if( nums[mid] == 1){
        mid++;
    }
    else {
        int temp = nums[r];
        nums[r] = nums[mid];
        nums[mid] = temp;
        r--;
    }
}

    }

}