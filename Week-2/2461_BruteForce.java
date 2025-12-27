class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i = 0,
            j = 0;
       long sum = 0,
            max = Integer.MIN_VALUE;

        for(i = 0;i<=nums.length-k;i++){
               sum = 0;
               Boolean isDup = false;
               Set<Integer> unique = new HashSet<>();
                for(j = i;j<i+k;j++){
                    if(unique.contains(nums[j])){
                        isDup = true;
                        break;
                    }

                    unique.add(nums[j]);
                    sum+=nums[j];
                }

                if(!isDup){
                    max = Math.max(max,sum);
                }
        }
        if(max==Integer.MIN_VALUE)
            return 0;


        return max;
    }
}