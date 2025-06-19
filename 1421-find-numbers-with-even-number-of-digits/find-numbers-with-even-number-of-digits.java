class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (isEven(nums[i])){
                count++;
            }
        }
        return count;
        
    }
    static boolean isEven(int num){
        int c=0;
        while (num>0){
            c++;
            num=num/10;
        }
        if (c%2==0){
            return true;
        }
        return false;
    }
}