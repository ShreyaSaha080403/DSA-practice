class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sp=0;
        int ep=numbers.length-1;
        while(sp<ep){
            if(numbers[sp]+numbers[ep]==target){
                break;
            }
            else if(numbers[sp]+numbers[ep]<target){
                sp++;
            }
            else
                ep--;
        }
        return new int[]{sp+1,ep+1};
    }
}