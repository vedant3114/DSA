class Solution {
    public void rotate(int[] nums, int k) {
        int size=nums.length;
       
        int[]copy=new int[size];
        for(int i=0;i<size;i++){
           copy[i]=nums[i];
        }
         for(int i=0;i<size;i++){
           nums[(i+k)%size]=copy[i];
        }
        
    }
}