class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                if (low > 0) low--;  // Assume a '(' can be closed
                high--;              // Always close something if possible
            } else if (ch == '*') {
                if (low > 0) low--;  // Treat '*' as ')'
                high++;              // Or treat '*' as '('
            }

            if (high < 0) return false; // Too many ')'
        }

        return low == 0; // All '(' are matched
    }
}
