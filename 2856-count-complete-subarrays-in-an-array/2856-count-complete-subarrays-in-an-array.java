class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int a : nums)
            s.add(a);
        int n = nums.length, k = s.size(), res = 0, i = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int j = 0; j < n; ++j) {
            if (count.getOrDefault(nums[j], 0) == 0)
                k--;
            count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
            while (k == 0) {
                count.put(nums[i], count.get(nums[i]) - 1);
                if (count.get(nums[i]) == 0)
                    k++;
                i++;
            }
            res += i;
        }
        return res;
    }
}