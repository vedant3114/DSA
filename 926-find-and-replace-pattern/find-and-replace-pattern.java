class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>res=new ArrayList<>();
        for(String s:words){
            if(isomorphic(s,pattern)){
                res.add(s);
            }
        }
        return res;
    }

    public boolean isomorphic(String s,String p){
        if(s.length()!=p.length()){
            return false;
        }
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=p.charAt(i);
            if(map.containsKey(ch1)){
                if(!map.get(ch1).equals(ch2)){
                    return false;
                }
            }else{
                if(map.containsValue(ch2)){
                    return false;
                }
                map.put(ch1,ch2);
            }
        }
        return true;
    }
}