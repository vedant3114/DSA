class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int start=0;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        for(int i=0;i<outer.size();i++){
            sum+=Xor(outer.get(i));
        }
        return sum;
        
    }
    static int Xor(List<Integer> list){
        if (list.size()==0){
            return 0;
        }
        int xor=list.get(0);
        for(int i=1;i<list.size();i++){
            xor^=list.get(i);
        }
        return xor;
    }
}