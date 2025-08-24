class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = Math.max(sum+arr[i], arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}