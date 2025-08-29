class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = s1.length()-1;
        while(start < end){
            if(s1.charAt(start) == s1.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}