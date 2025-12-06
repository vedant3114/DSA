class Solution {
    public int pivotIndex(int[] nums) {
        int og_sum=0;
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            og_sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            right=og_sum-left-nums[i];
            if(left==right){
                return i;
            }
            left+=nums[i];
        }
        return -1;


        
    }
}