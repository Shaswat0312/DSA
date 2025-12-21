class Solution {
    public boolean palindromeHelper(int start,int end,String s){
        int i = start;
        int j = end;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
                i++;
                j--;
        }

        return true;


    }


    public boolean validPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        while(left<right){

                if(s.charAt(left)!=s.charAt(right)){
                    return palindromeHelper(left+1,right,s)||palindromeHelper(left,right-1,s);
                }

                left++;
                right--;

        }

        return true;

    }
}