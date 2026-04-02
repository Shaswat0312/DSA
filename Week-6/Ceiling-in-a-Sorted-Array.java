// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;
        if(arr[high]<x)
            return -1;
            
        int result = -1;
            
        while(low<=high)
        {
          int mid = low + (high - low)/2;
          if(arr[mid]<x)
                low = mid + 1;
          else 
             {
                 result = mid;
                 high = mid - 1;
             }
        }
        
     
        return result;
        
    }
}
