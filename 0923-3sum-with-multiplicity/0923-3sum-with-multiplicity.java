class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int MOD = 1000000007;
        long ans = 0;

        int[] count = new int[101];
        for (int num : arr) {
            count[num]++;
        }
        for (int i = 0; i <= 100; i++) {
            for (int j = i; j <= 100; j++) {

                int k = target - i - j;
                if (k < 0 || k > 100) continue;
                if (j > k) continue;

                if (i == j && j == k) {
                    ans += (long) count[i] * (count[i] - 1) * (count[i] - 2) / 6;
                } 
                else if (i == j) {
                    ans += (long) count[i] * (count[i] - 1) / 2 * count[k];
                } 
                else if (j == k) {
                    ans += (long) count[j] * (count[j] - 1) / 2 * count[i];
                } 
                else {
                    ans += (long) count[i] * count[j] * count[k];
                }

                ans %= MOD;
            }
        }
        return (int) ans;
    }
}