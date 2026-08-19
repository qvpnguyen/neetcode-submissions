class Solution {
    
    public boolean hasDuplicate(int[] nums) {
        boolean duplicate = false;
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            } else {
                duplicate = true;
            }
        }
        return duplicate;
    }
}