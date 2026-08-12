class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        int longest=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int current=i;
                int length=1;
                while(set.contains(current+1)){
                    length+=1;
                    current+=1;
                }
                longest=Math.max(length,longest);
            }
        }
        return longest;
    }
}