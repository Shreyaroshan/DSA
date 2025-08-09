class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        double logValue = Math.log10(n) / Math.log10(2);
        return logValue == (int)logValue;
    }
}
