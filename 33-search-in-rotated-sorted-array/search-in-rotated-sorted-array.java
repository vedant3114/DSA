class Solution {
    public int search(int[] nums, int target) {
        int pivot= pivot(nums);
        if(pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }
        else{
           return BinarySearch(nums,target,pivot+1,nums.length-1);
        }
        
    }
    int pivot(int[] nums){
        int start=0;
        int end =nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    int BinarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;

    }
}