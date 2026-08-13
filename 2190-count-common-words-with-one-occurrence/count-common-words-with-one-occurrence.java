class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer>map1=new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        ArrayList<String>list=new ArrayList<>();
        for(String i:words1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(String i:words2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        for(String i:words2){
            if(map1.containsKey(i) && map1.get(i)==1 && map2.get(i)==1){
                list.add(i);
            }
        }
        return list.size();
    }
}