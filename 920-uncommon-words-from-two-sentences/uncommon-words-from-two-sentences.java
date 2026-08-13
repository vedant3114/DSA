class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer>map1=new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        ArrayList<String> list=new ArrayList<>();
        String[] str1=s1.trim().split("\\s");
        String[] str2=s2.trim().split("\\s");
        for(String i:str1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(String i:str2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        for(String i:str2){
            if((!map1.containsKey(i))&& map2.get(i)==1){
               list.add(i);
            }
        }
        for(String i:str1){
            if((!map2.containsKey(i))&& map1.get(i)==1){
               list.add(i);
            }
        }
        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}