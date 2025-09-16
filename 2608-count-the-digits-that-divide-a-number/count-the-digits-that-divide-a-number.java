class Solution {
    public int countDigits(int n) {
        int count = 0;
        int N = n;
        while(n>0){
            int r = n % 10;
            if(N % r == 0){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}