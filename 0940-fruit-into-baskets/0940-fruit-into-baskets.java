class Solution {
    public int totalFruit(int[] arr) {
         if (arr.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> fruitCount = new HashMap<>();
        int l = 0; // left pointer
        int r = 0; // right pointer
        int maxFruits = 0;

        // Use a single while loop to iterate through the array
        while (r < arr.length) {
            // Add the current fruit to the basket
            fruitCount.put(arr[r], fruitCount.getOrDefault(arr[r], 0) + 1);

            // If more than two types of fruits are in the baskets, shrink the window
            while (fruitCount.size() > 2) {
                fruitCount.put(arr[l], fruitCount.get(arr[l]) - 1);
                // If the count of a fruit type becomes zero, remove it from the map
                if (fruitCount.get(arr[l]) == 0) {
                    fruitCount.remove(arr[l]);
                }
                l++;
            }

            // Update the maximum number of fruits we can collect
            maxFruits = Math.max(maxFruits, r - l + 1);

            // Move the right pointer to the next element
            r++;
        }

        return maxFruits;
    }
}