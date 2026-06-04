class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
                return -1;
        }
    int low = Arrays.stream(bloomDay).min().getAsInt();
    int high = Arrays.stream(bloomDay).max().getAsInt();
    int ans =high;
    while(low <= high){
        int mid = low + (high - low)/2;
        if(canHelp(bloomDay, mid , k )>=m){
            ans = mid;
            high = mid -1;

        }
        else{
            low = mid+ 1;
        }
    }
        return ans;
    }

    public int canHelp(int[] bloomDay, int day, int k) {
        int p = 0;
        int v = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                p++;
                if (p == k) {
                    v++;
                    p = 0;
                }

            }
            else{
                    p = 0;
                }
        }
        return v;
    }
}