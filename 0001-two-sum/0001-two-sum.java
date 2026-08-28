class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> maps = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int remaining = target - nums[i];
            if(maps.containsKey(remaining)){
                return new int[]{maps.get(remaining),i};
            }
            maps.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}