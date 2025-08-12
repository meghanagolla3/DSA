class Solution {
    public int reverseBits(int n) {
        String ans = Integer.toBinaryString(n);
        String revAns ="";
        int bits = 32- ans.length();
        String bStr ="0".repeat(bits);
        String mask= bStr+ans;
        System.out.println(mask);
        for(int i=mask.length()-1; i>= 0; i--){
            revAns = revAns + mask.charAt(i);
        }
        int reverseBits = Integer.parseInt(revAns,2);
        return reverseBits;
    }
}