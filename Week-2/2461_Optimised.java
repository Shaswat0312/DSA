class Solution 
{

    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0,
            max = 0;
        int dups = 0;
        int i =0;

        Map<Integer, Integer> map = new HashMap<>();     
        for(;i<k;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }

            map.put(nums[i],map.get(nums[i])+1);
            sum+=nums[i];

            if(map.get(nums[i])>1){
                dups+=1;
            }
        }

        if(dups==0){
            max = Math.max(sum,max);
        }


        for(;i<nums.length;i++){
            int toAdd = nums[i];
            int todel = nums[i-k];


            if(!map.containsKey(toAdd)){
                map.put(toAdd,0);
            }

            map.put(toAdd,map.get(toAdd)+1);
            
            sum+=toAdd;
            sum-=todel;

            if(map.get(toAdd)>1){
                dups+=1;
            }

            if(map.get(todel)>1){
                dups-=1;
            }

            map.put(todel,map.get(todel)-1);

             if(dups==0){
            max = Math.max(sum,max);
        }

        }

        return max;  
          }
}