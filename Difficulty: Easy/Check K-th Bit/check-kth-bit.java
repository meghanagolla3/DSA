class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int bitMask = 1<<(k);
        int ans = n & bitMask;
        if(bitMask == ans ) return true;
        else return false;
    }
}