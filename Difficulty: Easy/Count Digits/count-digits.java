// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        int d;
        int r=n;
        while(r!=0){
            d = r%10;
            if(d!=0){
                if(n%d ==0){
                    count++;
                }
            }
            r = r/10;
            
        }
        return count;
    }
}