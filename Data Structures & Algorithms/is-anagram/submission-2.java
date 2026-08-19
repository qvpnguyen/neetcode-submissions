class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charsStringS = s.toCharArray();
        char[] charsStringT = t.toCharArray();
        Arrays.sort(charsStringS);
        Arrays.sort(charsStringT);
        return Arrays.equals(charsStringS, charsStringT);
    }
}
