class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int ans=0;
        int i =0;
        for(int j=0;j< nums.length; j++){
            ans = ans^(start+2*i);
            i++;
        }
        return ans;
    }
}