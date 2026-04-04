class Solution {
    public boolean accomodate(int[] stalls,int guess,int k){
        int cow = 1;
        int currPos = stalls[0];
        
        for(int i =1;i<stalls.length;i++)
        {
            int dist = stalls[i] - currPos;
            if(dist<guess){
                continue;
            }
            cow++;
            currPos = stalls[i];
        }
        
        return cow>=k;
        
    }
    public int aggressiveCows(int[] stalls, int k) {
    
        
      Arrays.sort(stalls); 
      int low = 1;
      int high = stalls[stalls.length - 1] - stalls[0];
      
      int res = -1;
      while(low<=high){
          int mid = low + (high-low)/2;
          
          if(accomodate(stalls,mid,k)){
              res = mid;
              low = mid + 1;
          }
          else {
              high = mid - 1;
          }
      }
      
      return res;
        
    }
}