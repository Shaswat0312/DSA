class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        
        int[][] arr = new int[start.length][2];
        
        
        for(int i = 0;i<start.length;i++){
            int s = start[i];
            int e = end[i];
            int[] ar = {s,e};
            arr[i] = ar;
        }
        
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
        
        
        int max = arr[0][1];
        int count = 1;
        int i = 1;
        while(i<arr.length)
        {
            int s2 = arr[i][0];
            if(s2<=max)
            {
                i++;
            }
            else{
                max = arr[i][1];
                count++;
                i++;
            }
        }
        
        return count;
    }
}
