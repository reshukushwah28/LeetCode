class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                ans.add(num);

            }

        }
        for(int i =0;i<ans.size();i++){
            nums[i] = ans.get(i);
        }
        return ans.size();
        
    }
}