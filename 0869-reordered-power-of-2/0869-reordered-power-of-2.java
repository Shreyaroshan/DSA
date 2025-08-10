class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] countN = countDigits(n);
        
        for (int i = 0; i < 31; i++) { // 2^0 to 2^30 fits in int
            if (sameCount(countN, countDigits(1 << i))) {
                return true;
            }
        }
        return false;
    }
    
    private int[] countDigits(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        return count;
    }
    
    private boolean sameCount(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
