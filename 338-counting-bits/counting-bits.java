class Solution {
    public int[] countBits(int n) {
        int count=0;
        int[] arr= new int[n+1];
        for(int i=0; i<=n; i++){

            String data = Integer.toBinaryString(i);
            for(int j=0; j<data.length();j++) {

                if (data.charAt(j) == '1') {
                    count++;
                    arr[i] = count;
                }
            }
            count=0;
        }
        return arr;
    }
    
}