class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ele = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (ele.containsKey(req)) {

                return new int[] { ele.get(req), i };
            }
            ele.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}