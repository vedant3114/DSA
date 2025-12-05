class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length-1;
        int count=0;
        int leftsum=0;
        for(int i=0;i<n;i++){
            leftsum+=nums[i];
            int rightsum=Sum(nums,i+1);
            int diff=leftsum-rightsum;
            if(diff%2==0){
                count+=1;
            }
        }
        return count;
    }
    static int Sum(int[] arr,int start){
        int sum=0;
        for(int i=start;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}