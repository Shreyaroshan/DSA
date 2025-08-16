class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9'); // change first '6' to '9'
                break; // only one change allowed
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
