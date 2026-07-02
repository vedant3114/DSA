class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int result=0;
        for(int i:nums){
            int dif =Math.abs(i-0);
            if(dif<min){
                min=dif;
                result=i;
            }
            if(dif==min && i>0){
                result=i;
            }

        }
        return result;
        
    }
}