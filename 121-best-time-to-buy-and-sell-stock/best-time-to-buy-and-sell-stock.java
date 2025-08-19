class Solution {
    public int maxProfit(int[] arr) {
        int min= arr[0];
        int max =0;
        for(int i=1; i< arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]-min);
        }
        return max;
    }
}