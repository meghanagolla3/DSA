class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int j=1;

        while(i<arr.length-1){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
            j++;

            if (j == arr.length) {
                i++;
                j=i+1;
            }
        }
        return new int[] {};
    }
}