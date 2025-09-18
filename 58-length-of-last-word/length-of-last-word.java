class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int i = s1.length()-1;
        int count=0;
        while( i >=0){
            if(s1.charAt(i) == ' '){
                return count;
            }

            count++;
            i--;

        }
        return count;
    }
}