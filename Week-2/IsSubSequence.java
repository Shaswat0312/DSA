class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0,
            j = 0,
            n = s.length(),
            k = t.length();

        while(i<n && j<k){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }

        if(i<n){
            return false;
        }

        return true;
    }
}