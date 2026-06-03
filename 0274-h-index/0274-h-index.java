class Solution {

    public int hIndex(int[] citations) {

        // ascending sort
        Arrays.sort(citations);

        int n = citations.length;

        for(int i = 0; i < n; i++) {

            // remaining papers
            int h = n - i;

            // valid h-index found
            if(citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}