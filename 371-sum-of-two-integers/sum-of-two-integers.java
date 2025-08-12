class Solution {
    public int getSum(int a, int b) {
        int n1 = a<<1;
        int n2 = b<<1;
        int ans = (n1+n2)>>1;
        return ans;
    }
}