class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> scan = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (scan.containsKey(diff)) {
                return new int[]{ scan.get(diff), i };
            }
            scan.put(nums[i], i);
        }
        return new int[0];
    }
}
