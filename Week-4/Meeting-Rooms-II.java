
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
    
        Map<Integer,Integer> maps = new TreeMap<>();
        
        for(int i = 0;i<start.length;i++)
        {
            int s = start[i];
            int e = end[i];
            
            maps.put(s,maps.getOrDefault(s,0)+1);
            maps.put(e,maps.getOrDefault(e,0)-1);
        }
        
        int rooms = 0;
        int req = 0;
        
      for(Map.Entry<Integer,Integer> entry : maps.entrySet())
      {
            rooms+=entry.getValue();
            req = Math.max(rooms,req);
        }
        
        return req;
    }
}
