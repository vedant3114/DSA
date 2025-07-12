class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        int hcf =0;
        int i=1;
        if(x+y <target){
            return false;
        }
        while(i<=x && i<=y){
            if(x%i==0 && y%i==0){
                if(hcf<i){
                    hcf=i;
                }
            }
            i++;
        }
        if (target%hcf==0){
            return true;
        }
        return false;
        
    }
}