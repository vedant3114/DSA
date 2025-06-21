class Solution {
    public int findPeakElement(int[] nums) {
       int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]){
                // this condition is true when we are decreasing side of numsay
                //in this  scenario end miht be the max element
                end=mid;
            }
            else{
                //this part is executed for increasing side
                start=mid+1;
            }
        }
        //at the end start and end will be at same  position pointing towards the mmax element
        return end;
        
    }
}