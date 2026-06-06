import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            long total = helper(piles, mid);
            
            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public long helper(int[] piles, int h) {
        long total = 0; 
        for (int num : piles) {
            total += (int) Math.ceil((double) num / h);
        }
        return total;
    }
}