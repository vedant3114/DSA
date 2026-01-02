class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        for(int i=0;i<k;i++){
            leftsum+=cardPoints[i];
        }
        int maxsum=leftsum;
        int rindex=cardPoints.length-1;
        int rightsum=0;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];
            rightsum+=cardPoints[rindex];
            rindex-=1;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }
        return maxsum;
        
    }
}