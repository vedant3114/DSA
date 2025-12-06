class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<>();
        while(n!=1){
            int sum=Sum(n);
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            n=sum;
        }
        return true;
        
    }
    static int Sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,2);
            n/=10;

        }
        return sum;
    }
}