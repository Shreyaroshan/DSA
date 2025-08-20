class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // base case: empty prefix has sum 0

        int currSum = 0, result = 0;

        for (int num : nums) {
            currSum += num;  // running prefix sum

            // If we have seen currSum - goal before,
            // then there exists a subarray ending at current index with sum = goal
            if (prefixCount.containsKey(currSum - goal)) {
                result += prefixCount.get(currSum - goal);
            }

            // store/update frequency of currSum
            prefixCount.put(currSum, prefixCount.getOrDefault(currSum, 0) + 1);
        }

        return result;
    }
}
