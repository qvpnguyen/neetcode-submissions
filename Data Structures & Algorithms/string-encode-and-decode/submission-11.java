class Solution {

    public String encode(List<String> strs) {
        if (strs.size() > 0) {
            String result = "";
            for (int i = 0; i < strs.size(); i++) {
                result += strs.get(i);
                if (i < strs.size() - 1) {
                    result += "\t";
                }
            }
            return result;
        }
        return null;
    }

    public List<String> decode(String str) {
        if (str == null) {
            return Arrays.asList();
        }
        if (str.isEmpty()) {
            return Arrays.asList(new String(""));
        } 
        return Arrays.asList(str.split("\t", -1));
    }
}
