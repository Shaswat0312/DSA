class Solution {

    public boolean hours(int[] piles,long guess,int hr)
    {
        long hour = 0;
        for(int i = 0;i<piles.length;i++)
        {
            hour = hour + (piles[i]/guess);
            if(piles[i]%guess!=0)
            {
                hour = hour + 1;
            }
        }

        return hour>hr;
    }

    public int minEatingSpeed(int[] piles, int h) 
    {
       long low = 1;
       long high = Long.MIN_VALUE;
       for(int i = 0;i<piles.length ;i++)
       {
          high = Math.max(high,piles[i]);
       }
       long res = -1;
       while(low<=high)
       {
        long mid =  low + (high-low)/2;
        if(hours(piles,mid,h))
            low = mid + 1;   
       else 
       {
        res = mid;
        high = mid - 1;
       }
       }
    return (int)res;
    }
}