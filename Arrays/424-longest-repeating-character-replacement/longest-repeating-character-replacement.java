class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxfreq=0;
        int maxans=0;
        int[] freq=new int[26];
        for(int right =0;right<s.length();right++)
        {
            char c=s.charAt(right);
            freq[c-'A']++;
            maxfreq=Math.max(maxfreq,freq[c-'A']);
            int window=right-left+1;
            int lim=window - maxfreq;
            if(lim>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxans=Math.max(maxans,right-left+1);
        }
        return maxans;
    }
}