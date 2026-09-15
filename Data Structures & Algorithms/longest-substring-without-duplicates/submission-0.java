class Solution {
    public int lengthOfLongestSubstring(String s) {
        String window = "";
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            int pos = window.indexOf(c);
            if (pos >= 0) {
                window = window.substring(pos + 1);
            }
            window += c;
            max = Math.max(max, window.length());
        }
        return max;
    }
}
