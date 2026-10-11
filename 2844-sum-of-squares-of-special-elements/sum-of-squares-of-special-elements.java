class Solution {
    public int sumOfSquares(int[] nums) {
        int size=nums.length;
        int sum=0;
        for(int i=1;i<=size;i++){
            if(size%i==0){
                sum+=Math.pow(nums[i-1],2);
            }
        }
        return sum;
    }
}