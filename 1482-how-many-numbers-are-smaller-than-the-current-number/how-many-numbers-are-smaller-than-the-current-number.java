class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int num=nums[i];
            int count =0;
            for(int j=0;j<nums.length;j++){
                if (nums[j]<num){
                    count++;
                }
            }
            ans[i]=count;
           
        }
        return ans;

        
    }
}