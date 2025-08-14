class Solution {
    public String largestGoodInteger(String num) {
        String largest = "";
        for (int i = 0; i <= num.length() - 3; i++) {
            char ch = num.charAt(i);
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                String candidate = num.substring(i, i + 3);
                if (candidate.compareTo(largest) > 0) {
                    largest = candidate;
                }
            }
        }
        return largest;
    }
}
