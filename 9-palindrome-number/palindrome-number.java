class Solution {
    public boolean isPalindrome(int n) {
        int r;
        int sum = 0;
        int temp = n;
        while(n>0){
            r = n%10;
            sum =(sum*10)+r;
            n = n/10;
        }
        if(sum == temp) return true;
        else return false;
    }
}