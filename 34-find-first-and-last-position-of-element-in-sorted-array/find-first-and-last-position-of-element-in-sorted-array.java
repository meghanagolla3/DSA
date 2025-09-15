class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] res = new int[2];
        int i = 0;
        int j =  arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid] < target){
                i =  mid+1;
            }else{
                j = mid -1;
            }
        }
         if (i >= arr.length || arr[i] != target) {
            return new int[]{-1, -1};
        }
        res[0] = i;

        j= arr.length-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid] <= target){
                i =  mid+1;
            }else{
                j = mid -1;
            }
        }
        res[1] = j;

        return res;
    }
}