class Solution {
    public boolean isAnagram(String s, String t) {
        char[] string=s.toCharArray();
        char[] term=t.toCharArray();
        if (s.length()!=t.length()){
            return false;
        }
        Arrays.sort(string);
        Arrays.sort(term);
        for(int i=0;i<string.length;i++){
            if(string[i]!=term[i]){
                return false;
            }
        }
        return true;
    }
}