class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //Max element dhundo taaki count array ki size fix ho sake (max 1000 diya hai constraints mein)
        int[] count = new int[1001];
        // arr1 ke elements ki frequency count karo
        for (int num : arr1) {
            count[num]++;
        }
        int[] result = new int[arr1.length];
        int idx = 0;
        //Pehle arr2 ke hisaab se elements ko result mein daalo
        for (int num : arr2) {
            while (count[num] > 0) {
                result[idx++] = num;
                count[num]--;
            }
        }
        // Ab bache hue elements ko ascending order mein daalo
        // (count array 0 se 1000 tak iterate karne par apne aap sorted order milega)
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[idx++] = i;
                count[i]--;
            }
        }
        
        return result;
    }
}
