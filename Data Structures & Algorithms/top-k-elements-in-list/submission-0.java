class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numbers = new HashMap<>();

        for (int num : nums) {

            if (!numbers.containsKey(num)) {
                numbers.put(num, 0);
            }

            numbers.put(num, numbers.get(num) + 1);

            
        }

        // Convert Map entries to a List
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numbers.entrySet());

        // Sort by frequency, highest first
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Store the top k numbers
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
