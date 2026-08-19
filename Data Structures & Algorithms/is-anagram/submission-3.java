class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charsStringS = s.toCharArray();
        char[] charsStringT = t.toCharArray();
        Arrays.sort(charsStringS);
        Arrays.sort(charsStringT);
        return Arrays.equals(charsStringS, charsStringT);
    }
}
