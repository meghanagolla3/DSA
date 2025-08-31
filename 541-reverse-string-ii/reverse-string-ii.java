class Solution {


     public static void reverse(char[] s, int left, int right){
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseStr(String s2, int k) {
        char[] s = s2.toCharArray();
        int left = 0;
        while (left < s.length) {
            int right = Math.min(left + k - 1, s.length-1);
            reverse(s,left,right);
            left = left + k + k;
        }

        String reverse = new String(s);
        return reverse;
    }
}