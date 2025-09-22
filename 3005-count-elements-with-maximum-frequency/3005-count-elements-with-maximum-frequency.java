class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int total = 0;

        for (int num : nums) {
            int freq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, freq);

            if (freq > maxFreq) {
                // New max frequency found → reset total to current frequency
                maxFreq = freq;
                total = freq;
            } else if (freq == maxFreq) {
                // Another element reaches the max frequency → add its frequency
                total += freq;
            }
        }

        return total;
    }
}