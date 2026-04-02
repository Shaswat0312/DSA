class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int res = -1;

        // [4,5,6,0,1,2,3]
        //  0,1,2,3,4,5,6
        //  L M H                
        //  res = 0
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]>nums[nums.length-1]){
                low = mid + 1;
            }
            else {
                res =  nums[mid];
                high = mid - 1;
            }
        }

        return  res;
    }
}