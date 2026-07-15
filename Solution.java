class Solution {
    public String longestPalindrome(String s) {
        String sub = "";
        String subMax = "";
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                sub += s.charAt(j);
                if (isPalindrome(sub) && sub.length() > max){
                    max = sub.length();
                    subMax = sub;
                }
            }
            sub = "";
        }

        return subMax;
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
