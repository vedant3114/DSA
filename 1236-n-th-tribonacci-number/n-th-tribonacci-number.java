class Solution {
    public int tribonacci(int n) {
        int n1=0;
        int n2=1;
        int n3=1;
        int sum=0;
        if(n==0){
            return 0;
        }
        if(n>0 && n<=2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            sum=n1+n2+n3;
            int temp=n2;
            n2=n3;
            n3=sum;
            n1=temp;
        }
        return sum;
        
    }
}