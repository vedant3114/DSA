class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pcounter=new int[26];
        int i=0;
        int j=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(char ch : p.toCharArray()){
            pcounter[ch - 'a']++;
        }
        while(j<s.length()){
            pcounter[s.charAt(j) - 'a']--;
            if(j-i+1==p.length()){
                if(allZero(pcounter)){
                    list.add(i);
                }
                pcounter[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return list;
        
    }
    public static boolean allZero(int[] pcounter){
        for(int i: pcounter){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}