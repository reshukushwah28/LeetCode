class Solution {
    public int maxArea(int[] height) {
        int left = 0;                 // left pointer
        int right = height.length - 1; // right pointer
        int maxArea = 0;              // store maximum area

        while (left < right) {
            // Calculate current area
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            // Move the pointer at the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}