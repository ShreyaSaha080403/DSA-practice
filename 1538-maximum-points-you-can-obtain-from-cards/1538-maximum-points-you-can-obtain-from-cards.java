class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0, rsum=0,max=0;
        for(int i=0;i<=k-1;i++){
            lsum+=cardPoints[i];
        }
        max=lsum;
        int index=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
             lsum=lsum-cardPoints[i];
             rsum+=cardPoints[index];
             index--;
             max=Math.max(max,lsum+rsum);
        }
        return max;
    }
}