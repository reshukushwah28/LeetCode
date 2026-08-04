class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r =0;
        int len=0;
        int count[] =  new int[256];
        while( r < s.length()){
            while(count[s.charAt(r)] == 1){
            count[s.charAt(l)] = 0;
            l++;
        }
        count[s.charAt(r)] = 1;
        len = Math.max(len , r-l+1);
        r++;
        }
        return len;

    }
    
}




