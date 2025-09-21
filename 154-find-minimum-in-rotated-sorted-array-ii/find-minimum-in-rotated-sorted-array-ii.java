class Solution {
    public int findMin(int[] arr) {
        // Arrays.sort(nums);
        int left = 0;
        int right = arr.length-1;
        // int ans = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] > arr[right]){
                // ans = Math.min(ans, arr[left]);
                left = mid+1;
            }else if(arr[mid] < arr[right]){
                // ans = Math.min(ans,arr[mid]);
                right = mid;
            }else{
                right--;
            }
        }
        return arr[left];
    }
}