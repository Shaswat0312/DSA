class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;

        int sum = (range*(range + 1))/2;

        int arraySum = 0;

        for(int i = 0;i<range ;i++){
            arraySum = arraySum + nums[i];
        }

        int missnum = sum - arraySum;


        return missnum;

        
    }
}