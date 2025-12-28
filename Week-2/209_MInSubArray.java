class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0,
            j = 0,
         sum = 0,
         size = Integer.MAX_VALUE;

         while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                size = Math.min(size,j-i+1);
                sum = sum - nums[i];
                i++;
            }

            j++;
         }

         if(size==Integer.MAX_VALUE)
                return 0;

         return size;
    }
}