
class Solution {
    public int minimumCost(int[] nums) {
       int first = nums[0];
        int n = nums.length;

        // Bubble sort from index 1 to n-1
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - (i - 1) - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return first + nums[1] + nums[2];
    
}
}