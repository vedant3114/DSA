class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int o =x;
        while (x>0){
            int rem=x%10;
            reverse=(reverse*10)+rem;
            x/=10;
        }
        if (o==reverse){
            return true;
        }else{
            return false;
        }
        
        
    }
}