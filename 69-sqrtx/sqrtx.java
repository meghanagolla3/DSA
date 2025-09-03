class Solution {
    public int mySqrt(int n) {
        int lo = 1, hi = n;
        int res = 1;
        if(n == 0){
            return 0;
        }
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long square = (long) mid * mid;
            
            // if square of mid is less than or equal to n 
            // update the result and search in upper half
           if (square <= n){
                res = mid;
                lo = mid + 1;
            }
            
            // if square of mid exceeds n, 
            // search in the lower half
            else {
                hi = mid - 1;
            }
        }
        
        return res;
    }
}