import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // ArrayList to store merged intervals
        ArrayList<int[]> result = new ArrayList<>();

        // Step 2: Initialize start and end
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Traverse the intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                // Overlapping interval -> merge
                end = Math.max(end, intervals[i][1]);
            } else {
                // No overlap -> store previous interval
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Step 4: Add the last interval
        result.add(new int[]{start, end});

        // Step 5: Convert ArrayList to int[][]
        return result.toArray(new int[result.size()][]);
    }
}