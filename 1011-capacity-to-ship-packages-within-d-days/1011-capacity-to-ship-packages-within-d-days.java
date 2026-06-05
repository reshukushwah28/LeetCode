import java.util.Arrays;

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShipWithCapacity(weights, days, mid)) {     
                high = mid - 1;
            } else {
                low = mid + 1;    
            }
        }

        return low;
    }

    private boolean canShipWithCapacity(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int Load = 0;

        for (int weight : weights) {
            if (Load + weight > capacity) {
                daysNeeded++;  
                Load = 0;
            }
            Load += weight;
        }
        return daysNeeded <= days;
    }
}