class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        while(i<haystack.length()){
            String substring= haystack.substring(i);
            if(substring.startsWith(needle)){
                return i;
            }
            i++;
        }
        return -1;
        
        
    }
}