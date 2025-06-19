import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
       ArrayList<Integer>list=new ArrayList<>();
       int i=1;
       int index=0;
       while (list.size()<k){
        if (index <arr.length && arr[index]==i){
            index++;
        }else{
            list.add(i);
        }
        i++;

       }
       return list.get(k-1);
        
    }
}