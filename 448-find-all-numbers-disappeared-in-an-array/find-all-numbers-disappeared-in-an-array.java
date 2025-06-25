class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if (nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
        
    }
    static void swap(int[] nums,int first,int last){
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
}