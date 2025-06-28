class Solution {
    public String toLowerCase(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int ascii= s.charAt(i);
            if(ascii >=65 && ascii<=90){
                ascii+=32;
            }
            char ch=(char)ascii;
            ans+=ch;
        }
        return ans;
        
    }
}