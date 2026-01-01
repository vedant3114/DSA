class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> map=new HashSet<>();
        for(char ch :sentence.toCharArray()){
            map.add(ch);
        }
        return map.size()==26;
       
        
    }
}