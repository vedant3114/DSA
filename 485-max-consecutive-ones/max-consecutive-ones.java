class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int ans=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count ++;
            }
            else{
                if(ans<=count){
                    ans=count;
                   
                }
                count=0;
            }
        }
        if(count>ans){
            ans=count;
        }
        return ans;
        
    }
}