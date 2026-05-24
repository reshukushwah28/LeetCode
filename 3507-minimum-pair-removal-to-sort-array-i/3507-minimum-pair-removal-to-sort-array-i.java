class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);

        }
        int op = 0;
        while(!isSorted(list)){
            int minS= Integer.MAX_VALUE;
            int target = -1;
            for(int i =0;i<list.size() -1 ;i++){
                int cur = list.get(i) + list.get(i+1);
                if(cur <minS){
                    minS= cur;
                    target = i;
                }
            }
            list.set(target, minS);
            list.remove(target+1);
            op++;
        }
        return op;
    }
    private boolean isSorted(List<Integer> list){
        for(int i =0;i<list.size() -1 ;i++){
            if(list.get(i) > list.get(i+1))
            {return false;
            }
            
        }return true;
    }
}