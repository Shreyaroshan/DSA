class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: For each character in ransomNote, check if it's available
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false; // Not enough of character c
            }
            map.put(c, map.get(c) - 1); // Use one occurrence of c
        }

        return true;
        
    }
}