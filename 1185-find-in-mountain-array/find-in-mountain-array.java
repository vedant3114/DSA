/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakInMountainArray(mountainArr);
        int firstHalf=BinarySearch(mountainArr,target,0,peak,true);
        if(firstHalf==-1){
            int secondhalf=BinarySearch(mountainArr,target,peak+1,mountainArr.length()-1,false);
            return secondhalf;
        }
        return firstHalf;

        
    }
    int peakInMountainArray(MountainArray mountainArr){
        int start =0;
        int end =mountainArr.length()-1;
        while(start <end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)> mountainArr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    int BinarySearch(MountainArray mountainArr,int target,int start,int end,boolean isIncreasing){
        while(start <= end){
            int mid=(start+end)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if (isIncreasing){
                if(mountainArr.get(mid)<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(mountainArr.get(mid)>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }


        }
        return -1;
    }
}