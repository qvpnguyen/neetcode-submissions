class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        int sequence = 1;
        int longestSequence = 1;
        for (int i = 0; i < numsCopy.length-1; i++) {
            if (numsCopy[i+1] - numsCopy[i] == 1 || numsCopy[i+1] - numsCopy[i] == -1) {
                if (sequence == longestSequence) {
                    sequence++;
                    longestSequence++;
                } else {
                    sequence++;
                }
            } else if (numsCopy[i+1] - numsCopy[i] == 0) {
                continue;
            } else {
                sequence = 1;
            }
        }
        return longestSequence; 
    }
}
