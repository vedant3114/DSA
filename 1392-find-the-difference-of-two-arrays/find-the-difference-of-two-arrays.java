class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>ans1=new ArrayList<>();
        List<Integer>ans2=new ArrayList<>();
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int i:nums1){
            if(!set1.contains(i)){
                set1.add(i);
            }
        }
        for(int i:nums2){
            if(!set2.contains(i)){
                set2.add(i);
            }
        }
        for(int i:set1){
            if(!set2.contains(i)){
                ans1.add(i);
            }
        }
        for(int i:set2){
            if(!set1.contains(i)){
                ans2.add(i);
            }
        }
        result.add(ans1);
        result.add(ans2);
        return result;
    }
}