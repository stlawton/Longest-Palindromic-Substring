class Solution {
    public String longestPalindrome(String s) {
        for(int i = 0; i < s.length(); i++){
            
        }
    }

    public Boolean isPalindrome(String s){
        int front = 0;
        int end = (s.length() - 1);

        while (front < end){
            if (s.charAt(front) != s.charAt(end)){
                return false;
            }

            front += 1;
            end -= 1;
        }
        return true;
    }
}
