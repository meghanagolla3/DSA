class Solution {
    public int addDigits(int n) {
        int i=0;
        while(n>0){
            int a = n / 10;
            int b = n % 10;
            n = a + b;
            if(n / 10 == 0){
                return n;
            }
        }
        if(n == 0){
            return 0;
        }
        return n;
    }
}