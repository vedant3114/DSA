class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct= nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if (nums[j]!=j+1){
                return nums[j];
            }
        }
        return nums[nums.length-1];
    }
    static void swap(int[] nums,int first,int last){
        int temp= nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}