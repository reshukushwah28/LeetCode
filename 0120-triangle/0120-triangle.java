class Solution {
    
    Integer[][] dp;
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        dp = new Integer[n][n];
        return helper(triangle, 0, 0);
    }
    
    public int helper(List<List<Integer>> triangle, int row, int col) {
        
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }
        
        if (dp[row][col] != null) {
            return dp[row][col];
        }
        
        int down = helper(triangle, row + 1, col);
        int diag = helper(triangle, row + 1, col + 1);
        
        dp[row][col] = triangle.get(row).get(col) + Math.min(down, diag);
        
        return dp[row][col];
    }
}