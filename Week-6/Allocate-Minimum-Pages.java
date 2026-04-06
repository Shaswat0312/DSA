class Solution {
    public boolean isFeasible(int[] arr,int books,int limit,int k)
    {
        int students = 1;
        int page = 0;
        for(int i = 0;i<arr.length;i++){
            if(page+arr[i]<=limit)
                {
                    page = page+arr[i];
                }
            else 
            {
                students++;
                page = arr[i];
                if(students>k){
                    return false;
                }
            }
        }
        return true;  
    }
    
    public int findPages(int[] arr, int k) {
        
        if(k>arr.length){
            return -1;
        }
        int low = 0,high = 0;
        for(int i = 0;i<arr.length;i++){
            low = Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isFeasible(arr,arr.length,mid,k)){
                res = mid;
                high = mid -1 ;
            }
            else {
                low = mid + 1;
            }
        }
        
        return res;
    }
}