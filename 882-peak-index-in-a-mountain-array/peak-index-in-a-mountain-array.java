class Solution {
    public int peakIndexInMountainArray(int[] arr) {

         int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]==max){
                return i;
            }
        }
        return 0;
        
        
    }
}