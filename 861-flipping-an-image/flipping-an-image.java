class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int start=0;
            int end=image[i].length-1;
            reverse(image[i],start,end);
            invert(image[i]);
        }
        return image;
        
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void invert(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]^1;
        }
    }
}