import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        
        for (int num : nums1) {
            h1.add(num);
        }
        
        for (int num : nums2) {
            if (h1.contains(num)) {
                h2.add(num);
            }
        }
        
        int[] result = new int[h2.size()];
        int i = 0;
        for (int num : h2) {
            result[i++] = num;
        }
        
        return result;
    }
}
