class Solution {
    public boolean isPalindrome(String s) {
        String str1 = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str1 += Character.toLowerCase(c);
            }
        }
        
        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
