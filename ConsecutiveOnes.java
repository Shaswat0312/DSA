class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int min = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                min = Math.max(min,count);
            }

            else{
                count = 0;
            }

        }
            return min;
    }
}