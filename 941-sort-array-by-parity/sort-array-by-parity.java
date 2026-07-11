class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            if(nums[i]%2==0 && nums[j]%2!=0 || nums[i]%2==0 && nums[j]%2==0){
                i++;
            }
            // if(nums[i]%2==0 && nums[j]%2==0){
            //     i++;
            // }
            j++;
        }
        return nums;
       
    }
}